package dk.apaq.economic.model.references;

import dk.apaq.economic.model.enums.PaymentTermsType;

public class PaymentTermsReference {
    private int daysOfCredit;
    private String name;
    private Integer paymentTermsNumber;
    private PaymentTermsType paymentTermsType;
    private String self;

    public int getDaysOfCredit() {
        return daysOfCredit;
    }

    /**
     * The number of days of credit on the invoice. This field is only valid if terms of payment is not of type ‘duedate
     * @param daysOfCredit
     */
    public void setDaysOfCredit(int daysOfCredit) {
        this.daysOfCredit = daysOfCredit;
    }

    public String getName() {
        return name;
    }

    /**
     * The name of the payment terms.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Integer getPaymentTermsNumber() {
        return paymentTermsNumber;
    }

    /**
     * A unique identifier of the payment term.
     * @param paymentTermsNumber
     */
    public void setPaymentTermsNumber(Integer paymentTermsNumber) {
        this.paymentTermsNumber = paymentTermsNumber;
    }

    public PaymentTermsType getPaymentTermsType() {
        return paymentTermsType;
    }

    /**
     * The type of payment term.
     * @param paymentTermsType
     */
    public void setPaymentTermsType(PaymentTermsType paymentTermsType) {
        this.paymentTermsType = paymentTermsType;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}
