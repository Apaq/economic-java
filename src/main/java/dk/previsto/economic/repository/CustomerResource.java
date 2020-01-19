package dk.previsto.economic.repository;

import java.util.HashMap;
import java.util.Map;

import dk.previsto.economic.model.Customer;
import org.springframework.web.client.RestTemplate;

public class CustomerResource extends Resource<Customer>{

    public CustomerResource(RestTemplate restTemplate, String serviceUrl) {
        super(Customer.class, "customers", restTemplate, serviceUrl, false);
    }
    
}
