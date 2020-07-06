package dk.apaq.economic.model;

public class VatZone extends Entity {
    private boolean enabledForCustomer;
    private boolean enabledForSupplier;
    private String name;
    private String self;
    private Integer vatZoneNumber;

    @Override
    public void setId(String id) {
        this.vatZoneNumber = id == null ? null : Integer.parseInt(id);
    }

    @Override
    public String getId() {
        return vatZoneNumber == null ? null : Integer.toString(vatZoneNumber);
    }

    public boolean isEnabledForCustomer() {
        return enabledForCustomer;
    }

    public void setEnabledForCustomer(boolean enabledForCustomer) {
        this.enabledForCustomer = enabledForCustomer;
    }

    public boolean isEnabledForSupplier() {
        return enabledForSupplier;
    }

    public void setEnabledForSupplier(boolean enabledForSupplier) {
        this.enabledForSupplier = enabledForSupplier;
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

    public Integer getVatZoneNumber() {
        return vatZoneNumber;
    }

    public void setVatZoneNumber(Integer vatZoneNumber) {
        this.vatZoneNumber = vatZoneNumber;
    }
}
