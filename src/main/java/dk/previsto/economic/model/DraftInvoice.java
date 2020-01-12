package dk.previsto.economic.model;

import dk.previsto.economic.model.references.CustomerReference;
import dk.previsto.economic.model.references.PaymentTermsReference;
import dk.previsto.economic.model.references.PdfReference;
import dk.previsto.economic.model.references.ProjectReference;
import org.springframework.data.domain.Persistable;

import java.time.LocalDate;

public class DraftInvoice implements Persistable<Integer> {
    private double costPriceInBaseCurrency;
    private String currency;
    private CustomerReference customer;
    private LocalDate date;
    private Delivery delivery;
    private Integer draftInvoiceNumber;
    private LocalDate dueDate;
    private double exchangeRate;
    private double grossAmount;
    private double grossAmountBaseCurrency;
    private double marginPercentage;
    private double netAmount;
    private double netAmountBaseCurrency;
    private Notes notes;
    private PaymentTermsReference paymentTerms;
    private PdfReference pdf;
    private ProjectReference project;
    private Recipient recipient;
    private InvoiceReferences references;
    private double roundingAmount;
    private String self;
    private Soap soap;
    private Templates templates;
    private double vatAmount;

    @Override
    public Integer getId() {
        return draftInvoiceNumber;
    }

    @Override
    public boolean isNew() {
        return draftInvoiceNumber == null;
    }

    public double getCostPriceInBaseCurrency() {
        return costPriceInBaseCurrency;
    }

    public void setCostPriceInBaseCurrency(double costPriceInBaseCurrency) {
        this.costPriceInBaseCurrency = costPriceInBaseCurrency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CustomerReference getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerReference customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Integer getDraftInvoiceNumber() {
        return draftInvoiceNumber;
    }

    public void setDraftInvoiceNumber(Integer draftInvoiceNumber) {
        this.draftInvoiceNumber = draftInvoiceNumber;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public double getGrossAmountBaseCurrency() {
        return grossAmountBaseCurrency;
    }

    public void setGrossAmountBaseCurrency(double grossAmountBaseCurrency) {
        this.grossAmountBaseCurrency = grossAmountBaseCurrency;
    }

    public double getMarginPercentage() {
        return marginPercentage;
    }

    public void setMarginPercentage(double marginPercentage) {
        this.marginPercentage = marginPercentage;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public double getNetAmountBaseCurrency() {
        return netAmountBaseCurrency;
    }

    public void setNetAmountBaseCurrency(double netAmountBaseCurrency) {
        this.netAmountBaseCurrency = netAmountBaseCurrency;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public PaymentTermsReference getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(PaymentTermsReference paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public PdfReference getPdf() {
        return pdf;
    }

    public void setPdf(PdfReference pdf) {
        this.pdf = pdf;
    }

    public ProjectReference getProject() {
        return project;
    }

    public void setProject(ProjectReference project) {
        this.project = project;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public InvoiceReferences getReferences() {
        return references;
    }

    public void setReferences(InvoiceReferences references) {
        this.references = references;
    }

    public double getRoundingAmount() {
        return roundingAmount;
    }

    public void setRoundingAmount(double roundingAmount) {
        this.roundingAmount = roundingAmount;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Soap getSoap() {
        return soap;
    }

    public void setSoap(Soap soap) {
        this.soap = soap;
    }

    public Templates getTemplates() {
        return templates;
    }

    public void setTemplates(Templates templates) {
        this.templates = templates;
    }

    public double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(double vatAmount) {
        this.vatAmount = vatAmount;
    }
}
