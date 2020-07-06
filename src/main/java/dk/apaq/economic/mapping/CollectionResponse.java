package dk.apaq.economic.mapping;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;

public class CollectionResponse<T> {
    private Paging pagination;
    private List<T> collection;

    public Paging getPagination() {
        return pagination;
    }

    public void setPagination(Paging pagination) {
        this.pagination = pagination;
    }

    public List<T> getCollection() {
        return collection;
    }

    public void setCollection(List<T> collection) {
        this.collection = collection;
    }

    public Page<T> getPage() {
        return new PageImpl<>(collection);
    }
}
