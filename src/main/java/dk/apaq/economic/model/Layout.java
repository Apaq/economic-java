package dk.apaq.economic.model;

public class Layout extends Entity {
    private Integer layoutNumber;
    private String name;
    private String self;

    public Integer getLayoutNumber() {
        return layoutNumber;
    }

    public void setLayoutNumber(Integer layoutNumber) {
        this.layoutNumber = layoutNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    @Override
    public void setId(String id) {
        this.layoutNumber = id == null ? null : Integer.parseInt(id);
    }

    @Override
    public String getId() {
        return layoutNumber == null ? null : Integer.toString(layoutNumber);
    }
}
