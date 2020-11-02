package dk.apaq.economic.model.references;

public class CustomerReference {
    private int customerNumber;
    private String self;

    public int getCustomerNumber() {
        return customerNumber;
    }

    /**
     * The customer number is a positive unique numerical identifier with a maximum of 9 digits.
     * @param customerNumber
     */
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}
