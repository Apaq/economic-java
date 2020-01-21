package dk.previsto.economic.model;

import dk.previsto.economic.model.references.*;

import java.time.LocalDate;
import java.util.List;

public class BookedInvoice extends Entity {
    private Integer bookedInvoiceNumber;
    private String currency;
    private CustomerReference customer;
    private LocalDate date;
    private Delivery delivery;
    private LocalDate dueDate;
    private double exchangeRate;
    private double grossAmount;
    private double grossAmountInBaseCurrency;
    private LayoutReference layout;
    private List<Line> lines;
    private double netAmount;
    private double netAmountBaseCurrency;
    private Notes notes;
    private PaymentTermsReference paymentTerms;
    private PdfReference pdf;
    private ProjectReference project;
    private Recipient recipient;
    private InvoiceReferences references;
    private double remainder;
    private double remainderBaseCurrency;
    private double roundingAmount;
    private String self;
    private String sent;
    private double vatAmount;

    @Override
    public String getId() {
        return Integer.toString(bookedInvoiceNumber);
    }

    @Override
    public void setId(String id) {
        this.bookedInvoiceNumber = Integer.parseInt(id);
    }

    public Integer getBookedInvoiceNumber() {
        return bookedInvoiceNumber;
    }

    public void setBookedInvoiceNumber(Integer bookedInvoiceNumber) {
        this.bookedInvoiceNumber = bookedInvoiceNumber;
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

    public double getGrossAmountInBaseCurrency() {
        return grossAmountInBaseCurrency;
    }

    public void setGrossAmountInBaseCurrency(double grossAmountInBaseCurrency) {
        this.grossAmountInBaseCurrency = grossAmountInBaseCurrency;
    }

    public LayoutReference getLayout() {
        return layout;
    }

    public void setLayout(LayoutReference layout) {
        this.layout = layout;
    }

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
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

    public double getRemainder() {
        return remainder;
    }

    public void setRemainder(double remainder) {
        this.remainder = remainder;
    }

    public double getRemainderBaseCurrency() {
        return remainderBaseCurrency;
    }

    public void setRemainderBaseCurrency(double remainderBaseCurrency) {
        this.remainderBaseCurrency = remainderBaseCurrency;
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

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(double vatAmount) {
        this.vatAmount = vatAmount;
    }
}
