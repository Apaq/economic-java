package dk.apaq.economic.model.references;

public class VatZoneReference {
    private String self;
    private Integer vatZoneNumber;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Integer getVatZoneNumber() {
        return vatZoneNumber;
    }

    /**
     * Unique identifier of the vat zone.
     * @param vatZoneNumber
     */
    public void setVatZoneNumber(Integer vatZoneNumber) {
        this.vatZoneNumber = vatZoneNumber;
    }
}
