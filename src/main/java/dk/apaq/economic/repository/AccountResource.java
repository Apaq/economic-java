package dk.apaq.economic.repository;

import dk.apaq.economic.model.Account;
import org.springframework.web.client.RestTemplate;

public class AccountResource extends Resource<Account>{

    public AccountResource(RestTemplate restTemplate, String serviceUrl) {
        super(Account.class, "accounts", restTemplate, serviceUrl, false);
    }
    
}