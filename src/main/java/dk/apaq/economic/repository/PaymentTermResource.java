package dk.apaq.economic.repository;

import dk.apaq.economic.model.PaymentTerm;
import org.springframework.web.client.RestTemplate;

public class PaymentTermResource extends Resource<PaymentTerm>{

    public PaymentTermResource(RestTemplate restTemplate, String serviceUrl) {
        super(PaymentTerm.class, "payment-terms", restTemplate, serviceUrl, false);
    }
    
}