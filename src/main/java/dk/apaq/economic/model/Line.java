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

    /**
     * The price of 1 unit of the goods or services on the invoice line in the invoice currency.
     * @return
     */
    public Double getUnitNetPrice() {
        return unitNetPrice;
    }

    public void setUnitNetPrice(Double unitNetPrice) {
        this.unitNetPrice = unitNetPrice;
    }

    public Double getUnitCostPrice() {
        return unitCostPrice;
    }

    /**
     * The cost price of 1 unit of the goods or services in the invoice currency.
     * @param unitCostPrice
     */
    public void setUnitCostPrice(Double unitCostPrice) {
        this.unitCostPrice = unitCostPrice;
    }

    public Double getVatAmount() {
        return vatAmount;
    }

    /**
     * The total amount of VAT on the invoice line in the invoice currency. This will have the same sign as total net
     * amount
     * @param vatAmount
     */
    public void setVatAmount(Double vatAmount) {
        this.vatAmount = vatAmount;
    }

    public Double getVatRate() {
        return vatRate;
    }

    /**
     * The VAT rate in % used to calculate the vat amount on this line.
     * @param vatRate
     */
    public void setVatRate(Double vatRate) {
        this.vatRate = vatRate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Invoice delivery date.
     * @param deliveryDate
     */
    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public DepartmentalDistributionReference getDepartmentalDistribution() {
        return departmentalDistribution;
    }

    /**
     * A departmental distribution defines which departments this invoice line is distributed between. This requires
     * the departments module to be enabled.
     * @param departmentalDistribution
     */
    public void setDepartmentalDistribution(DepartmentalDistributionReference departmentalDistribution) {
        this.departmentalDistribution = departmentalDistribution;
    }

    public String getDescription() {
        return description;
    }

    /**
     * A description of the product or service sold.
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * A line discount expressed as a percentage.
     * @param discountPercentage
     */
    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }


    public ProductReference getProduct() {
        return product;
    }

    /**
     * The product or service offered on the invoice line.
     * @param product
     */
    public void setProduct(ProductReference product) {
        this.product = product;
    }

    public Double getQuantity() {
        return quantity;
    }

    /**
     * The number of units of goods on the invoice line.
     * @param quantity
     */
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getTotalNetAmount() {
        return totalNetAmount;
    }

    /**
     * The total invoice line amount in the invoice currency before all taxes and discounts have been applied. For a
     * credit note this amount will be negative.
     * @param totalNetAmount
     */
    public void setTotalNetAmount(Double totalNetAmount) {
        this.totalNetAmount = totalNetAmount;
    }
}
