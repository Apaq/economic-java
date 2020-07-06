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

    public void setCustomerContact(CustomerContactReference customerContact) {
        this.customerContact = customerContact;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public EmployeeReference getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(EmployeeReference salesPerson) {
        this.salesPerson = salesPerson;
    }

    public EmployeeReference getVendorReference() {
        return vendorReference;
    }

    public void setVendorReference(EmployeeReference vendorReference) {
        this.vendorReference = vendorReference;
    }
}
