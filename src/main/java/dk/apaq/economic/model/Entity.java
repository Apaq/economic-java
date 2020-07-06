package dk.apaq.economic.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.domain.Persistable;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Entity implements Persistable<String> {
    public abstract void setId(String id);

    public boolean isNew() {
        return this.getId() == null;
    }
}
