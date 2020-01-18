package dk.previsto.economic.model;

import org.springframework.data.domain.Persistable;

public abstract class Entity implements Persistable<String> {
    public abstract void setId(String id);

    public boolean isNew() {
        return this.getId() == null;
    }
}
