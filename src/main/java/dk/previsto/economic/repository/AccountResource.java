package dk.previsto.economic.repository;

import dk.previsto.economic.mapping.PersistAccountMapping;
import dk.previsto.economic.mapping.PluralAccountMapping;
import dk.previsto.economic.mapping.SingularAccountMapping;
import dk.previsto.economic.model.Account;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestTemplate;

public class AccountResource extends Resource<Account>{
    
    private static final Map<String, String> SIDELOAD_PARAMS = new HashMap<>();
    
    static {
        SIDELOAD_PARAMS.put("include", "account.group");
    }

    public AccountResource(RestTemplate restTemplate, String serviceUrl) {
        super(SingularAccountMapping.class, PluralAccountMapping.class, PersistAccountMapping.class, "accounts", restTemplate, serviceUrl, SIDELOAD_PARAMS);
    }
    
}