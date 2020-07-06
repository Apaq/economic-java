package dk.apaq.economic.model;

import dk.apaq.economic.model.references.DepartmentalDistributionReference;
import dk.apaq.economic.model.references.ProductReference;

import java.time.LocalDate;

public class Line {
    private LocalDate deliveryDate;
    private DepartmentalDistributionReference departmentalDistribution;
    private String description;
    private Double discountPercentage;
    private ProductReference product;
    private Double quantity;
    private Double totalNetAmount;
    private Double marginBaseCurrency;
    private Double marginPercentage;
    private Double unitNetPrice;
    private Double unitCostPrice;
    private Double vatAmount;
    private Double vatRate;

    public Double getMarginBaseCurrency() {
        return marginBaseCurrency;
    }

    public void setMarginBaseCurrency(Double marginBaseCurrency) {
        this.marginBaseCurrency = marginBaseCurrency;
    }

    public Double getMarginPercentage() {
        return marginPercentage;
    }

    public void setMarginPercentage(Double marginPercentage) {
        this.marginPercentage = marginPercentage;
    }

    public Double getUnitNetPrice() {
        return unitNetPrice;
    }

    public void setUnitNetPrice(Double unitNetPrice) {
        this.unitNetPrice = unitNetPrice;
    }

    public Double getUnitCostPrice() {
        return unitCostPrice;
    }

    public void setUnitCostPrice(Double unitCostPrice) {
        this.unitCostPrice = unitCostPrice;
    }

    public Double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(Double vatAmount) {
        this.vatAmount = vatAmount;
    }

    public Double getVatRate() {
        return vatRate;
    }

    public void setVatRate(Double vatRate) {
        this.vatRate = vatRate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
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

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }


    public ProductReference getProduct() {
        return product;
    }

    public void setProduct(ProductReference product) {
        this.product = product;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getTotalNetAmount() {
        return totalNetAmount;
    }

    public void setTotalNetAmount(Double totalNetAmount) {
        this.totalNetAmount = totalNetAmount;
    }
}
