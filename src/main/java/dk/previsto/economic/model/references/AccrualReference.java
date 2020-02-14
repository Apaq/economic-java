package dk.previsto.economic.model.references;

import dk.previsto.economic.model.enums.AccountType;
import dk.previsto.economic.model.enums.TransferType;

public class AccrualReference {
    private Integer accountNumber;
    private AccountType accountType;
    private String accountingYears;
    private AccrualSummed accountsSummed;
    private double balance;
    private boolean barred;
    private boolean blockDirectEntries;
    private AccrualAccountRef contraAccount;
    private TransferType debitCredit;
    private double draftBalance;
    private String name;
    private AccrualAccountRef totalFromAccount;
    //private Vat vatAccount;

}
