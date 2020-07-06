package dk.apaq.economic.model.references;

public class LayoutReference {
    private Integer layoutNumber;
    private String self;
    private boolean deleted;
    private String name;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLayoutNumber() {
        return layoutNumber;
    }

    public void setLayoutNumber(Integer layoutNumber) {
        this.layoutNumber = layoutNumber;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}
