package dk.previsto.economic.model;

import dk.previsto.economic.model.references.DepartmentalDistributionReference;
import dk.previsto.economic.model.references.ProductInvoicesReference;
import org.springframework.data.domain.Persistable;

import java.time.LocalDate;

public class Product extends Entity {

    private String barCode;
    private boolean barred;
    private double costPrice;
    private DepartmentalDistributionReference departmentalDistribution;
    private String description;
    //private Inventory inventory;
    //private ProductInvoicesReference invoices;
    private LocalDate lastUpdated;
    private String name;
    //private ProductGroup productGroup;
    private String productNumber;
    private double recommendPrice;
    private double salesPrice;
    private String self;
    private Unit unit;

    @Override
    public String getId() {
        return productNumber == null ? null : productNumber;
    }

    @Override
    public void setId(String id) {
        this.productNumber = id;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public boolean isBarred() {
        return barred;
    }

    public void setBarred(boolean barred) {
        this.barred = barred;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public DepartmentalDistributionReference getDepartmentalDistribution() {
        return departmentalDistribution;
    }

    public void setDepartmentalDistribution(DepartmentalDistributionReference departmentalDistribution) {
        this.departmentalDistribution = departmentalDistribution;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public double getRecommendPrice() {
        return recommendPrice;
    }

    public void setRecommendPrice(double recommendPrice) {
        this.recommendPrice = recommendPrice;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
