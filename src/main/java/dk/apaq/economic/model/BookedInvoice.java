package dk.apaq.economic.model;

import dk.apaq.economic.model.references.*;

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
        this.bookedInvoiceNumber = id == null ? null : Integer.parseInt(id);
    }

    public Integer getBookedInvoiceNumber() {
        return bookedInvoiceNumber;
    }

    /**
     * A reference number for the booked invoice document.
     * @param bookedInvoiceNumber
     */
    public void setBookedInvoiceNumber(Integer bookedInvoiceNumber) {
        this.bookedInvoiceNumber = bookedInvoiceNumber;
    }

    public String getCurrency() {
        return currency;
    }

    /**
     * 	The ISO 4217 currency code of the invoice.
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CustomerReference getCustomer() {
        return customer;
    }

    /**
     * The customer being invoiced.
     * @param customer
     */
    public void setCustomer(CustomerReference customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    /**
     * Invoice issue date.
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    /**
     * The actual place of delivery for the goods on the invoice. This is usually the same place as the one
     * referenced in the deliveryLocation property, but may be edited as required.
     * @param delivery
     */
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * The date the invoice is due for payment. Only used if the terms of payment is of type ‘duedate’, in which case it is mandatory.
     * @param dueDate
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * The exchange rate between the invoice currency and the base currency of the agreement. The exchange rate
     * expresses how much it will cost in base currency to buy 100 units of the invoice currency.
     * @param exchangeRate
     */
    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    /**
     * The total invoice amount in the invoice currency after all taxes and discounts have been applied. For a credit
     * note this amount will be negative.
     * @param grossAmount
     */
    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public double getGrossAmountInBaseCurrency() {
        return grossAmountInBaseCurrency;
    }

    /**
     * The total invoice amount in the base currency of the agreement after all taxes and discounts have been applied.
     * For a credit note this amount will be negative.
     * @param grossAmountInBaseCurrency
     */
    public void setGrossAmountInBaseCurrency(double grossAmountInBaseCurrency) {
        this.grossAmountInBaseCurrency = grossAmountInBaseCurrency;
    }

    public LayoutReference getLayout() {
        return layout;
    }

    /**
     * Layout to be applied for this invoice.
     * @param layout
     */
    public void setLayout(LayoutReference layout) {
        this.layout = layout;
    }

    public List<Line> getLines() {
        return lines;
    }

    /**
     * An array containing the specific invoice lines.
     * @param lines
     */
    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    public double getNetAmount() {
        return netAmount;
    }

    /**
     * The total invoice amount in the invoice currency before all taxes and discounts have been applied. For a credit
     * note this amount will be negative.
     * @param netAmount
     */
    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public double getNetAmountBaseCurrency() {
        return netAmountBaseCurrency;
    }

    /**
     * 	The total invoice amount in the base currency of the agreement before all taxes and discounts have been applied.
     * 	For a credit note this amount will be negative.
     * @param netAmountBaseCurrency
     */
    public void setNetAmountBaseCurrency(double netAmountBaseCurrency) {
        this.netAmountBaseCurrency = netAmountBaseCurrency;
    }

    public Notes getNotes() {
        return notes;
    }

    /**
     * Notes on the invoice.
     * @param notes
     */
    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public PaymentTermsReference getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * The terms of payment for the invoice.
     * @param paymentTerms
     */
    public void setPaymentTerms(PaymentTermsReference paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public PdfReference getPdf() {
        return pdf;
    }

    /**
     * References a pdf representation of this invoice.
     * @param pdf
     */
    public void setPdf(PdfReference pdf) {
        this.pdf = pdf;
    }

    public ProjectReference getProject() {
        return project;
    }

    /**
     * A reference to any project this entry might be related to. This requires the projects module to be enabled.
     * @param project
     */
    public void setProject(ProjectReference project) {
        this.project = project;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    /**
     * The actual recipient of the invoice. This may be the same info found on the customer (and will probably be so in
     * most cases) but it may also be a different recipient. For instance, the customer placing the order may be ACME
     * Headquarters, but the recipient of the invoice may be ACME IT.
     * @param recipient
     */
    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public InvoiceReferences getReferences() {
        return references;
    }

    /**
     * Customer and company references related to this invoice.
     * @param references
     */
    public void setReferences(InvoiceReferences references) {
        this.references = references;
    }

    public double getRemainder() {
        return remainder;
    }

    /**
     * Remaining amount to be paid.
     * @param remainder
     */
    public void setRemainder(double remainder) {
        this.remainder = remainder;
    }

    public double getRemainderBaseCurrency() {
        return remainderBaseCurrency;
    }

    /**
     * 	Remaining amount to be paid in base currency.
     * @param remainderBaseCurrency
     */
    public void setRemainderBaseCurrency(double remainderBaseCurrency) {
        this.remainderBaseCurrency = remainderBaseCurrency;
    }

    public double getRoundingAmount() {
        return roundingAmount;
    }

    /**
     * The total rounding error, if any, on the invoice in base currency.
     * @param roundingAmount
     */
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

    /**
     * A convenience link to see if the invoice has been sent or not.
     * @param sent
     */
    public void setSent(String sent) {
        this.sent = sent;
    }

    public double getVatAmount() {
        return vatAmount;
    }

    /**
     * The total amount of VAT on the invoice in the invoice currency. This will have the same sign as net amount
     * @param vatAmount
     */
    public void setVatAmount(double vatAmount) {
        this.vatAmount = vatAmount;
    }
}
