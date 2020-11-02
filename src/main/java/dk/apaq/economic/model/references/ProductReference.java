package dk.apaq.economic.model.references;

public class ProductReference {
    private String productNumber;
    private String self;

    public String getProductNumber() {
        return productNumber;
    }

    /**
     * The unique product number. This can be a stock keeping unit identifier (SKU).
     * @param productNumber
     */
    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}
