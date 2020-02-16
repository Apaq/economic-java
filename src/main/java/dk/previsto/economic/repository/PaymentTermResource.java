package dk.previsto.economic.repository;

import dk.previsto.economic.model.Account;
import dk.previsto.economic.model.PaymentTerm;
import org.springframework.web.client.RestTemplate;

public class PaymentTermResource extends Resource<PaymentTerm>{

    public PaymentTermResource(RestTemplate restTemplate, String serviceUrl) {
        super(PaymentTerm.class, "payment-terms", restTemplate, serviceUrl, false);
    }
    
}