package dk.previsto.economic.model;

import dk.previsto.economic.model.references.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DraftInvoice extends Entity {
    private Double costPriceInBaseCurrency;
    private String currency;
    private CustomerReference customer = new CustomerReference();
    private LocalDate date = LocalDate.now();
    private Delivery delivery = new Delivery();
    private Integer draftInvoiceNumber;
    private LocalDate dueDate;
    private Double exchangeRate;
    private Double grossAmount;
    private Double grossAmountBaseCurrency;
    private Double marginPercentage;
    private Double netAmount;
    private Double netAmountBaseCurrency;
    private List<Line> lines = new ArrayList<>();
    private Notes notes = new Notes();
    private PaymentTermsReference paymentTerms = new PaymentTermsReference();
    private PdfReference pdf = new PdfReference();
    private ProjectReference project;
    private Recipient recipient = new Recipient();
    private InvoiceReferences references = new InvoiceReferences();
    private Double roundingAmount;
    private String self;
    private Double vatAmount;
    private LayoutReference layout = new LayoutReference();

    @Override
    public String getId() {
        return draftInvoiceNumber == null ? null : Integer.toString(draftInvoiceNumber);
    }

    @Override
    public void setId(String id) {
        this.draftInvoiceNumber = id == null ? null : Integer.parseInt(id);
    }

    public Double getCostPriceInBaseCurrency() {
        return costPriceInBaseCurrency;
    }

    public void setCostPriceInBaseCurrency(Double costPriceInBaseCurrency) {
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

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public Double getGrossAmountBaseCurrency() {
        return grossAmountBaseCurrency;
    }

    public void setGrossAmountBaseCurrency(Double grossAmountBaseCurrency) {
        this.grossAmountBaseCurrency = grossAmountBaseCurrency;
    }

    public Double getMarginPercentage() {
        return marginPercentage;
    }

    public void setMarginPercentage(Double marginPercentage) {
        this.marginPercentage = marginPercentage;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public Double getNetAmountBaseCurrency() {
        return netAmountBaseCurrency;
    }

    public void setNetAmountBaseCurrency(Double netAmountBaseCurrency) {
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

    public Double getRoundingAmount() {
        return roundingAmount;
    }

    public void setRoundingAmount(Double roundingAmount) {
        this.roundingAmount = roundingAmount;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(Double vatAmount) {
        this.vatAmount = vatAmount;
    }

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    public LayoutReference getLayout() {
        return layout;
    }

    public void setLayout(LayoutReference layout) {
        this.layout = layout;
    }
}
