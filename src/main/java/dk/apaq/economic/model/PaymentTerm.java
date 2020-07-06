package dk.apaq.economic.model;

import dk.apaq.economic.model.references.CustomerReference;
import dk.apaq.economic.model.references.AccrualAccountRef;

public class PaymentTerm extends Entity {
    private AccrualAccountRef contraAccountForPrepaidAmount;
    private AccrualAccountRef contraAccountForRemainderAmount;
    private CustomerReference creditCardCompany;
    private Integer daysOfCredit;
    private String description;
    private String name;
    private Integer paymentTermsNumber;
    private double percentageForPrepaidAmount;
    private double percentageForRemainderAmount;
    private String self;

    @Override
    public void setId(String id) {
        this.paymentTermsNumber = id == null ? null : Integer.parseInt(id);
    }

    @Override
    public String getId() {
        return paymentTermsNumber == null ? null : Integer.toString(paymentTermsNumber);
    }

    public AccrualAccountRef getContraAccountForPrepaidAmount() {
        return contraAccountForPrepaidAmount;
    }

    public void setContraAccountForPrepaidAmount(AccrualAccountRef contraAccountForPrepaidAmount) {
        this.contraAccountForPrepaidAmount = contraAccountForPrepaidAmount;
    }

    public AccrualAccountRef getContraAccountForRemainderAmount() {
        return contraAccountForRemainderAmount;
    }

    public void setContraAccountForRemainderAmount(AccrualAccountRef contraAccountForRemainderAmount) {
        this.contraAccountForRemainderAmount = contraAccountForRemainderAmount;
    }

    public CustomerReference getCreditCardCompany() {
        return creditCardCompany;
    }

    public void setCreditCardCompany(CustomerReference creditCardCompany) {
        this.creditCardCompany = creditCardCompany;
    }

    public Integer getDaysOfCredit() {
        return daysOfCredit;
    }

    public void setDaysOfCredit(Integer daysOfCredit) {
        this.daysOfCredit = daysOfCredit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPaymentTermsNumber() {
        return paymentTermsNumber;
    }

    public void setPaymentTermsNumber(Integer paymentTermsNumber) {
        this.paymentTermsNumber = paymentTermsNumber;
    }

    public double getPercentageForPrepaidAmount() {
        return percentageForPrepaidAmount;
    }

    public void setPercentageForPrepaidAmount(double percentageForPrepaidAmount) {
        this.percentageForPrepaidAmount = percentageForPrepaidAmount;
    }

    public double getPercentageForRemainderAmount() {
        return percentageForRemainderAmount;
    }

    public void setPercentageForRemainderAmount(double percentageForRemainderAmount) {
        this.percentageForRemainderAmount = percentageForRemainderAmount;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}
