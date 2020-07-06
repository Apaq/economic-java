package dk.apaq.economic.model;

import dk.apaq.economic.model.enums.AccountType;
import dk.apaq.economic.model.enums.RecordType;

public class Account extends Entity {
     private Integer accountNumber;//	integer				The account’s number.
     private AccountType accountType; //	Enum			profitAndLoss, status, totalFrom, heading, headingStart, sumInterval, sumAlpha	The type of account in the chart of accounts.
     private String accountingYears; //	string	uri			A link to a list of accounting years for which the account is usable.
     //private List<int> accountsSummed; //	array				An array of the account intervals used for calculating the total for this account.
     //private String accountsSummed.fromAccount	object				The first account in the interval.
     //* accountsSummed.fromAccount.accountNumber	integer				Account number of the first account in the interval.
     //* accountsSummed.fromAccount.self	string	uri			The unique self link of the first account in the interval.
     //* accountsSummed.toAccount	object				The last account in the interval.
     //* accountsSummed.toAccount.accountNumber	integer				Account number of the last account in the interval.
     //* accountsSummed.toAccount.self	string	uri			The unique self link of the last account in the interval.
     private double balance;//	number				The current balanace of the account.
     private boolean barred;//	boolean				Shows if the account is barred from being used.
     private boolean blockDirectEntries;//	boolean				Determines if the account can be manually updated with entries.
     //contraAccount	object				The default contra account of the account.
     //* contraAccount.accountNumber	integer				Account number of the contra account.
     //* contraAccount.self	string	uri			The unique self link of the contra account.
     private RecordType debitCredit; //	Enum			debit, credit	Describes the default update type of the account.
     private double draftBalance;//	number				The current balance of the account including draft (not yet booked) entries.
     private String name;//	string		125		The name of the account.
     private String self;//	string	uri			A unique reference to the account resource.
     //* totalFromAccount	object				The account from which the sum total for this account is calculated.
     //* totalFromAccount.accountNumber	integer				Account number of the first account.
     //* totalFromAccount.self	string	uri			The unique self link of the first account.
     //* vatAccount	object
     //* vatAccount.self	string	uri			The unique self link of the VAT code.
     //* vatAccount.vatCode	string		5		The VAT code of the VAT account for this account.


    @Override
    public String getId() {
        return accountNumber == null ? null : Integer.toString(accountNumber);
    }

    @Override
    public void setId(String id) {
        this.accountNumber = id == null ? null : Integer.parseInt(id);
    }

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

    public boolean isBarred() {
        return barred;
    }

    public void setBarred(boolean barred) {
        this.barred = barred;
    }

    public boolean isBlockDirectEntries() {
        return blockDirectEntries;
    }

    public void setBlockDirectEntries(boolean blockDirectEntries) {
        this.blockDirectEntries = blockDirectEntries;
    }

    public RecordType getDebitCredit() {
        return debitCredit;
    }

    public void setDebitCredit(RecordType debitCredit) {
        this.debitCredit = debitCredit;
    }

    public double getDraftBalance() {
        return draftBalance;
    }

    public void setDraftBalance(double draftBalance) {
        this.draftBalance = draftBalance;
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
