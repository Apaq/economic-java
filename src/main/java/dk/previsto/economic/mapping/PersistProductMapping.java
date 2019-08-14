package dk.previsto.economic.mapping;

public class PersistProductMapping implements PersistMapping<Product> {
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void setEntity(Product entity) {
        this.product = entity;
    }
    
    
}
