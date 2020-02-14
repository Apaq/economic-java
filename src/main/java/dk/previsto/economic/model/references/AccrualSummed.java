package dk.previsto.economic.model.references;

public class AccrualSummed {
    private AccrualAccountRef fromAccount;
    private AccrualAccountRef toAccount;

    public AccrualAccountRef getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(AccrualAccountRef fromAccount) {
        this.fromAccount = fromAccount;
    }

    public AccrualAccountRef getToAccount() {
        return toAccount;
    }

    public void setToAccount(AccrualAccountRef toAccount) {
        this.toAccount = toAccount;
    }
}
