package dk.previsto.economic.model;

import dk.previsto.economic.model.references.AccrualReference;

public class ProductGroup extends Entity {
    private AccrualReference accrual;

    private boolean inventoryEnabled;
    private String name;
    private Integer productGroupNumber;
    private String products;
    private String salesAccounts;
    private String self;

    public AccrualReference getAccrual() {
        return accrual;
    }

    public void setAccrual(AccrualReference accrual) {
        this.accrual = accrual;
    }

    public boolean isInventoryEnabled() {
        return inventoryEnabled;
    }

    public void setInventoryEnabled(boolean inventoryEnabled) {
        this.inventoryEnabled = inventoryEnabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProductGroupNumber() {
        return productGroupNumber;
    }

    public void setProductGroupNumber(Integer productGroupNumber) {
        this.productGroupNumber = productGroupNumber;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getSalesAccounts() {
        return salesAccounts;
    }

    public void setSalesAccounts(String salesAccounts) {
        this.salesAccounts = salesAccounts;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    @Override
    public void setId(String id) {
        this.productGroupNumber = id == null ? null : Integer.parseInt(id);
    }

    @Override
    public String getId() {
        return this.productGroupNumber == null ? null : productGroupNumber.toString();
    }
}
