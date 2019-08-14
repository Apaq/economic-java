package dk.previsto.economic.repository;

import dk.previsto.economic.mapping.PersistProductMapping;
import dk.previsto.economic.mapping.PluralProductMapping;
import dk.previsto.economic.mapping.SingularProductMapping;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestTemplate;

public class ProductResource extends Resource<Product>{
    
    private static final Map<String, String> SIDELOAD_PARAMS = new HashMap<>();
    
    static {
    }
    
    public ProductResource(RestTemplate restTemplate, String serviceUrl) {
        super(SingularProductMapping.class, PluralProductMapping.class, PersistProductMapping.class, "products", restTemplate, serviceUrl, SIDELOAD_PARAMS);
    }
    
}