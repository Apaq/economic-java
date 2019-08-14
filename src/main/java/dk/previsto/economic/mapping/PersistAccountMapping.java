package dk.previsto.economic.mapping;

import dk.previsto.economic.model.Account;

public class PersistAccountMapping implements PersistMapping<Account> {
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void setEntity(Account entity) {
        this.account = entity;
    }
    
    
}
