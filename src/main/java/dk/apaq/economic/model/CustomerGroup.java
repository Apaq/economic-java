package dk.apaq.economic.model;

import dk.apaq.economic.model.references.AccountReference;

public class CustomerGroup extends Entity {
    private AccountReference account;
    private Integer customerGroupNumber;
    private String customers;
    private String name;
    private String self;


    public AccountReference getAccount() {
        return account;
    }

    public void setAccount(AccountReference account) {
        this.account = account;
    }

    public Integer getCustomerGroupNumber() {
        return customerGroupNumber;
    }

    public void setCustomerGroupNumber(Integer customerGroupNumber) {
        this.customerGroupNumber = customerGroupNumber;
    }

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    @Override
    public void setId(String id) {
        this.customerGroupNumber = id == null ? null : Integer.parseInt(id);
    }

    @Override
    public String getId() {
        return customerGroupNumber == null ? null : customerGroupNumber.toString();
    }
}
