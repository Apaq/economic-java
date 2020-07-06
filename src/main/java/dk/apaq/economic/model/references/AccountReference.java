package dk.apaq.economic.model.references;

import dk.apaq.economic.model.enums.AccountType;
import dk.apaq.economic.model.enums.TransferType;

public class AccountReference {
    private Integer accountNumber;
    private AccountType accountType;
    private String accountingYears;
    private double balance;
    private boolean blockDirectEntries;
    private TransferType debitCredit = TransferType.credit;
    private String name;
    private String self;

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getAccountingYears() {
        return accountingYears;
    }

    public void setAccountingYears(String accountingYears) {
        this.accountingYears = accountingYears;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlockDirectEntries() {
        return blockDirectEntries;
    }

    public void setBlockDirectEntries(boolean blockDirectEntries) {
        this.blockDirectEntries = blockDirectEntries;
    }

    public TransferType getDebitCredit() {
        return debitCredit;
    }

    public void setDebitCredit(TransferType debitCredit) {
        this.debitCredit = debitCredit;
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
}
