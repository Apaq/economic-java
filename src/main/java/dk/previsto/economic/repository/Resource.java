package dk.previsto.economic.repository;

import dk.previsto.economic.exception.RequestException;
import dk.previsto.economic.exception.ResourceNotFoundException;
import dk.previsto.economic.exception.UnknownException;
import dk.previsto.economic.mapping.CollectionResponse;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

import dk.previsto.economic.model.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Persistable;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public abstract class Resource<T extends Entity> {

    private static final Logger LOG = LoggerFactory.getLogger(Resource.class);
    protected final RestTemplate restTemplate;
    protected final String serviceUrl;
    protected String resourceName;
    private Class clazz;
    private boolean queryLacksFields = false;

    public Resource(Class clazz, String resourceName, RestTemplate restTemplate, String serviceUrl, boolean queryLacksFields) {
        this.resourceName = resourceName;
        this.restTemplate = restTemplate;
        this.serviceUrl = serviceUrl;
        this.clazz = clazz;
        this.queryLacksFields = queryLacksFields;
    }

    public boolean isQueryLacksFields() {
        return queryLacksFields;
    }

    public List<T> findAll() {
        return findAll(PageRequest.of(0, 1000)).getContent();
    }

    public Page<T> findAll(PageRequest pageRequest) {
        return findAll(pageRequest, null);
    }

    public Page<T> findAll(PageRequest pageRequest, String filter) {
        URI url = buildUri();
        int count = -1;
        ParameterizedTypeReference<List<T>> responseType = new ParameterizedTypeReference<List<T>>() {
            @Override
            public Type getType() {
                return Array.newInstance(clazz, 0).getClass();
            }
        };

        UriComponentsBuilder builder = UriComponentsBuilder.fromUri(url);
        if (pageRequest != null) {
            builder.queryParam("skipPages", pageRequest.getPageNumber());
            builder.queryParam("pageSize", pageRequest.getPageSize());
        }

        if(filter != null) {
            builder.queryParam("filter", filter);
        }

        url = builder.build().encode().toUri();
        ResponseEntity resp = restTemplate.exchange(url, HttpMethod.GET, null, responseType);
        T[] result = (T[]) resp.getBody();

        if (resp.getHeaders().getFirst("Count") != null) {
            try {
                count = Integer.parseInt(resp.getHeaders().getFirst("Count"));
            } catch (NumberFormatException ex) {
                LOG.info("Unable to parse count.", ex);
            }
        }

        if(queryLacksFields) {
            // We need to request each single entity to get all fields
            List<T> tmp = new ArrayList<>();
            for(T e : result) {
                tmp.add(get(e.getId()));
            }
            result = (T[]) tmp.toArray(result);
        }

        return new PageImpl<>(Arrays.asList(result), pageRequest, count);
    }

    public T get(String id) {
        URI uri = buildUri(id);
        try {
            T entity = (T) restTemplate.getForObject(uri, clazz);
            return entity;
        } catch(ResourceNotFoundException ex) {
            return null;
        }
    }

    public void delete(T entity) {
        Persistable<String> e = null;
        if(entity instanceof Persistable) {
            e = (Persistable<String>) entity;
        }
        if (e == null || e.getId() == null) {
            throw new RequestException("Entity cannot be deleted, because it has no id.");
        }
        delete(e.getId());
    }

    public void delete(String id) {
        restTemplate.delete(buildUri(id));
    }

    public T save(T entity) {
        if(!(entity instanceof Persistable)) {
            throw new RequestException("Entity cannot be persisted.");
        }

        Persistable<String> e = (Persistable<String>) entity;
        URI uri = buildUri(e.getId());
        T persistedEntity;

        if(e.getId() == null) {
            ResponseEntity<T> response = restTemplate.postForEntity(uri, entity, clazz);
            persistedEntity = response.getBody();
        } else {
            restTemplate.put(uri, entity);
            persistedEntity = entity;
        }

        return persistedEntity;
    }

    protected URI buildUri() {
        return this.buildUri(null);
    }

    protected URI buildUri(String id) {
        return buildUri(id, null);
    }

    protected URI buildUri(String id, String suffix) {
        try {
            String url = serviceUrl + "/" + resourceName;
            if(id != null) {
                url += "/" + id;
            }

            if(suffix != null) {
                url += suffix;
            }

            return new URI(url);
        } catch (URISyntaxException ex) {
            LOG.error("URI invalid.", ex);
            throw new IllegalArgumentException("Url is not valid.", ex);
        }
    }


}
