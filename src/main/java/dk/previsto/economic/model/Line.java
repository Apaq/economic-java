package dk.previsto.economic.model;

import dk.previsto.economic.model.references.DepartmentalDistributionReference;
import dk.previsto.economic.model.references.ProductReference;

import java.time.LocalDate;

public class Line {
    private LocalDate deliveryDate;
    private DepartmentalDistributionReference departmentalDistribution;
    private String description;
    private double discountPercentage;
    private int lineNumber;
    private ProductReference product;
    private double quantity;
    private int sortKey;
    private double totalNetAmount;
    private double marginBaseCurrency;
    private double marginPercentage;
    private double unitNetPrice;
    private double unitCostPrice;
    private double vatAmount;
    private double vatRate;

    public double getMarginBaseCurrency() {
        return marginBaseCurrency;
    }

    public void setMarginBaseCurrency(double marginBaseCurrency) {
        this.marginBaseCurrency = marginBaseCurrency;
    }

    public double getMarginPercentage() {
        return marginPercentage;
    }

    public void setMarginPercentage(double marginPercentage) {
        this.marginPercentage = marginPercentage;
    }

    public double getUnitNetPrice() {
        return unitNetPrice;
    }

    public void setUnitNetPrice(double unitNetPrice) {
        this.unitNetPrice = unitNetPrice;
    }

    public double getUnitCostPrice() {
        return unitCostPrice;
    }

    public void setUnitCostPrice(double unitCostPrice) {
        this.unitCostPrice = unitCostPrice;
    }

    public double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(double vatAmount) {
        this.vatAmount = vatAmount;
    }

    public double getVatRate() {
        return vatRate;
    }

    public void setVatRate(double vatRate) {
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

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public ProductReference getProduct() {
        return product;
    }

    public void setProduct(ProductReference product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getSortKey() {
        return sortKey;
    }

    public void setSortKey(int sortKey) {
        this.sortKey = sortKey;
    }

    public double getTotalNetAmount() {
        return totalNetAmount;
    }

    public void setTotalNetAmount(double totalNetAmount) {
        this.totalNetAmount = totalNetAmount;
    }
}
