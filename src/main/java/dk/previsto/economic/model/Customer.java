package dk.previsto.economic.model;

import java.time.Instant;

public class Customer {

    private String address;//	string			510				Address for the customer including street and number.
    //attention	object							The customer’s person of attention.
    //attention.customerContactNumber	integer							The unique identifier of the customer employee.
    //attention.self	string	uri						A unique link reference to the customer employee item.
    //balance	number		True					The outstanding amount for this customer.
    private boolean barred; //	boolean							Boolean indication of whether the customer is barred from invoicing.
    private String city;//	string			50				The customer’s city.
    private String contacts;//	string	uri						A unique link reference to the customer contacts items.
    private String corporateIdentificationNumber;//	string			40				Corporate Identification Number. For example CVR in Denmark.
    private String country;//	string			50				The customer’s country.
    private double creditLimit;//	number							A maximum credit for this customer. Once the maximum is reached or passed in connection with an order/quotation/invoice for this customer you see a warning in e-conomic.
    private String currency;//	string			3	3			Default payment currency.
    //customerContact	object							Reference to main contact employee at customer.
    //customerContact.customerContactNumber	integer							The unique identifier of the customer contact.
    //customerContact.self	string	uri						A unique link reference to the customer contact item.
    //customerGroup	object							Reference to the customer group this customer is attached to.
    //customerGroup.customerGroupNumber	integer							The unique identifier of the customer group.
    //customerGroup.self	string	uri						A unique link reference to the customer group item.
    private int customerNumber; //	integer					999999999	1	The customer number is a positive unique numerical identifier with a maximum of 9 digits.
    //defaultDeliveryLocation	object							Customers default delivery location.
    //defaultDeliveryLocation.deliveryLocationNumber	integer							The unique identifier of the delivery location.
    //defaultDeliveryLocation.self	string	uri						A unique link reference to the delivery location.
    private String deliveryLocations;//	string	uri						A unique link reference to the customer delivery locations items.
    private String ean; //	string			13				European Article Number. EAN is used for invoicing the Danish public sector.
    private String email; //	string			255				Customer e-mail address where e-conomic invoices should be emailed. Note: you can specify multiple email addresses in this field, separated by a space. If you need to send a copy of the invoice or write to other e-mail addresses, you can also create one or more customer contacts.
    //invoices	object
    //invoices.booked	string	uri						The unique reference to the booked invoices for this customer.
    //invoices.drafts	string	uri						The unique reference to the draft invoices for this customer.
    //invoices.self	string	uri						A unique link reference to the invoices resource for this customer.
    private Instant lastUpdated;//	string	full-date						The date this customer was last updated. The date is formatted according to ISO-8601.
    //layout	object							Layout to be applied for invoices and other documents for this customer.
    //layout.layoutNumber	integer							The unique identifier of the layout.
    //layout.self	string	uri						A unique link reference to the layout item.
    private String mobilePhone;//	string			50				The customer’s mobile phone number.
    private String name; //	string			255	1			The customer name.
    private String pNumber; //	string			10	10			Extension of corporate identification number (CVR). Identifying separate production unit (p-nummer).
    //paymentTerms	object							The default payment terms for the customer.
    //paymentTerms.paymentTermsNumber	integer							The unique identifier of the payment terms.
    //paymentTerms.self	string	uri						A unique link reference to the payment terms item.
    private String publicEntryNumber; //	string			50				The public entry number is used for electronic invoicing, to define the account invoices will be registered on at the customer.
    //salesPerson	object							Reference to the employee responsible for contact with this customer.
    //salesPerson.employeeNumber	integer							The unique identifier of the employee.
    //salesPerson.self	string	uri						A unique link reference to the employee resource.
    //self	string	uri						The unique self reference of the customer resource.
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
    //vatZone	object							Indicates in which VAT-zone the customer is located (e.g.: domestically, in Europe or elsewhere abroad).
    //vatZone.self	string	uri						A unique link reference to the VAT-zone item.
    //vatZone.vatZoneNumber	integer							The unique identifier of the VAT-zone.
    private String website; //	string			255				Customer website, if applicable.
    private String zip; //	string			30				The customer’s postcode.

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
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

    public String getPublicEntryNumber() {
        return publicEntryNumber;
    }

    public void setPublicEntryNumber(String publicEntryNumber) {
        this.publicEntryNumber = publicEntryNumber;
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
