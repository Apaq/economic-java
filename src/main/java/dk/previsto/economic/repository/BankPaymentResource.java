package dk.previsto.economic.repository;

import dk.previsto.economic.mapping.PersistBankPaymentMapping;
import dk.previsto.economic.mapping.PluralBankPaymentMapping;
import dk.previsto.economic.mapping.SingularBankPaymentMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class BankPaymentResource extends Resource<BankPayment>{

    private static final Map<String, String> SIDELOAD_PARAMS = new HashMap<>();


    public BankPaymentResource(RestTemplate restTemplate, String serviceUrl) {
        super(SingularBankPaymentMapping.class, PluralBankPaymentMapping.class, PersistBankPaymentMapping.class, "bankPayments", restTemplate, serviceUrl, SIDELOAD_PARAMS);
    }
    
}