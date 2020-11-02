package dk.apaq.economic.model.references;

public class CustomerContactReference {
    private int customerContactNumber;
    private String self;

    public int getCustomerContactNumber() {
        return customerContactNumber;
    }

    /**
     * Unique identifier of the customer employee.
     * @param customerContactNumber
     */
    public void setCustomerContactNumber(int customerContactNumber) {
        this.customerContactNumber = customerContactNumber;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}
