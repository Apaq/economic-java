package dk.apaq.economic.model.references;

public class CustomerPaymentTermsReference {
    private int paymentTermsNumber;
    private String self;

    public int getPaymentTermsNumber() {
        return paymentTermsNumber;
    }

    public void setPaymentTermsNumber(int paymentTermsNumber) {
        this.paymentTermsNumber = paymentTermsNumber;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}
