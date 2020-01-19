package dk.previsto.economic.model;

public class Unit {
    private String name;
    private String self;
    private int unitNumber;
    private double unitCostPrice;
    private double unitNetPrice;
    private double vatAmount;

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

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public double getUnitCostPrice() {
        return unitCostPrice;
    }

    public void setUnitCostPrice(double unitCostPrice) {
        this.unitCostPrice = unitCostPrice;
    }

    public double getUnitNetPrice() {
        return unitNetPrice;
    }

    public void setUnitNetPrice(double unitNetPrice) {
        this.unitNetPrice = unitNetPrice;
    }

    public double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(double vatAmount) {
        this.vatAmount = vatAmount;
    }
}
