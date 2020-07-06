package dk.apaq.economic.model;

import dk.apaq.economic.model.references.*;

import java.time.Instant;

public class Customer extends Entity {

    private String address;//	string			510				Address for the customer including street and number.
    private CustomerContactReference attention;
    private double balance;
    private boolean barred; //	boolean							Boolean indication of whether the customer is barred from invoicing.
    private String city;//	string			50				The customer’s city.
    private String contacts;//	string	uri						A unique link reference to the customer contacts items.
    private String corporateIdentificationNumber;//	string			40				Corporate Identification Number. For example CVR in Denmark.
    private String country;//	string			50				The customer’s country.
    private double creditLimit;//	number							A maximum credit for this customer. Once the maximum is reached or passed in connection with an order/quotation/invoice for this customer you see a warning in e-conomic.
    private String currency;//	string			3	3			Default payment currency.
    private CustomerContactReference customerContact;
    private CustomerGroupReference customerGroup;
    private Integer customerNumber; //	integer					999999999	1	The customer number is a positive unique numerical identifier with a maximum of 9 digits.
    private DeliveryLocationReference defaultDeliveryLocation;
    private String deliveryLocations;//	string	uri						A unique link reference to the customer delivery locations items.
    private String ean; //	string			13				European Article Number. EAN is used for invoicing the Danish public sector.
    private String email; //	string			255				Customer e-mail address where e-conomic invoices should be emailed. Note: you can specify multiple email addresses in this field, separated by a space. If you need to send a copy of the invoice or write to other e-mail addresses, you can also create one or more customer contacts.
    //invoices	object
    //invoices.booked	string	uri						The unique reference to the booked invoices for this customer.
    //invoices.drafts	string	uri						The unique reference to the draft invoices for this customer.
    //invoices.self	string	uri						A unique link reference to the invoices resource for this customer.
    private Instant lastUpdated;//	string	full-date						The date this customer was last updated. The date is formatted according to ISO-8601.
    private LayoutReference layout;
    private String mobilePhone;//	string			50				The customer’s mobile phone number.
    private String name; //	string			255	1			The customer name.
    private String pNumber; //	string			10	10			Extension of corporate identification number (CVR). Identifying separate production unit (p-nummer).
    private CustomerPaymentTermsReference paymentTerms;
    private String publicEntryNumber; //	string			50				The public entry number is used for electronic invoicing, to define the account invoices will be registered on at the customer.
    private EmployeeReference salesPerson;
    private String telephoneAndFaxNumber; //	string			255				The customer’s telephone and/or fax number.
    //templates	object
    //templates.invoice	string	uri						The unique reference to the invoice template.
    //templates.invoiceLine	string	uri						The unique reference to the invoiceLine template.
    //templates.self	string	uri						A unique link reference to the templates resource.
    //totals	object
    //totals.booked	string	uri						The unique reference to the booked invoice totals for this customer.
    //totals.drafts	string	uri						The unique reference to the draft invoice totals for this customer.
    //totals.self	string	uri						A unique link reference to the totals resource for this customer.
    private String vatNumber;//	string			50				The customer’s value added tax identification number. This field is only available to agreements in Sweden, UK, Germany, Poland and Finland. Not to be mistaken for the danish CVR number, which is defined on the corporateIdentificationNumber property.
    private VatZoneReference vatZone;
    private String website; //	string			255				Customer website, if applicable.
    private String zip; //	string			30				The customer’s postcode.

    @Override
    public String getId() {
        return customerNumber == null ? null : Integer.toString(customerNumber);
    }

    @Override
    public void setId(String id) {
        this.customerNumber = id == null ? null : Integer.parseInt(id);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerContactReference getAttention() {
        return attention;
    }

    public void setAttention(CustomerContactReference atttention) {
        this.attention = atttention;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBarred() {
        return barred;
    }

    public void setBarred(boolean barred) {
        this.barred = barred;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getCorporateIdentificationNumber() {
        return corporateIdentificationNumber;
    }

    public void setCorporateIdentificationNumber(String corporateIdentificationNumber) {
        this.corporateIdentificationNumber = corporateIdentificationNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CustomerContactReference getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(CustomerContactReference customerContact) {
        this.customerContact = customerContact;
    }

    public CustomerGroupReference getCustomerGroup() {
        return customerGroup;
    }

    public void setCustomerGroup(CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public DeliveryLocationReference getDefaultDeliveryLocation() {
        return defaultDeliveryLocation;
    }

    public void setDefaultDeliveryLocation(DeliveryLocationReference defaultDeliveryLocation) {
        this.defaultDeliveryLocation = defaultDeliveryLocation;
    }

    public String getDeliveryLocations() {
        return deliveryLocations;
    }

    public void setDeliveryLocations(String deliveryLocations) {
        this.deliveryLocations = deliveryLocations;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instant getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Instant lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public LayoutReference getLayout() {
        return layout;
    }

    public void setLayout(LayoutReference layout) {
        this.layout = layout;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public CustomerPaymentTermsReference getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(CustomerPaymentTermsReference paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public String getPublicEntryNumber() {
        return publicEntryNumber;
    }

    public void setPublicEntryNumber(String publicEntryNumber) {
        this.publicEntryNumber = publicEntryNumber;
    }

    public EmployeeReference getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(EmployeeReference salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getTelephoneAndFaxNumber() {
        return telephoneAndFaxNumber;
    }

    public void setTelephoneAndFaxNumber(String telephoneAndFaxNumber) {
        this.telephoneAndFaxNumber = telephoneAndFaxNumber;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public VatZoneReference getVatZone() {
        return vatZone;
    }

    public void setVatZone(VatZoneReference vatZone) {
        this.vatZone = vatZone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
