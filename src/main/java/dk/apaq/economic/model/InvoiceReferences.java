package dk.apaq.economic.model;

import dk.apaq.economic.model.references.CustomerContactReference;
import dk.apaq.economic.model.references.EmployeeReference;

public class InvoiceReferences {
    private CustomerContactReference customerContact;
    private String other;
    private EmployeeReference salesPerson;
    private EmployeeReference vendorReference;

    public CustomerContactReference getCustomerContact() {
        return customerContact;
    }

    /**
     * The customer contact is a reference to the employee at the customer to contact regarding the invoice.
     * @param customerContact
     */
    public void setCustomerContact(CustomerContactReference customerContact) {
        this.customerContact = customerContact;
    }

    public String getOther() {
        return other;
    }

    /**
     * A text field that can be used to save any custom reference on the invoice.
     * @param other
     */
    public void setOther(String other) {
        this.other = other;
    }

    public EmployeeReference getSalesPerson() {
        return salesPerson;
    }

    /**
     * The sales person is a reference to the employee who sold the goods on the invoice. This is also the person who is
     * credited with this sale in reports.
     * @param salesPerson
     */
    public void setSalesPerson(EmployeeReference salesPerson) {
        this.salesPerson = salesPerson;
    }

    public EmployeeReference getVendorReference() {
        return vendorReference;
    }

    /**
     * A reference to any second employee involved in the sale.
     * @param vendorReference
     */
    public void setVendorReference(EmployeeReference vendorReference) {
        this.vendorReference = vendorReference;
    }
}
