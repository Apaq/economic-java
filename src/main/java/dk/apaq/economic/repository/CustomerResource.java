package dk.apaq.economic.repository;

import dk.apaq.economic.model.Customer;
import org.springframework.web.client.RestTemplate;

public class CustomerResource extends Resource<Customer>{

    public CustomerResource(RestTemplate restTemplate, String serviceUrl) {
        super(Customer.class, "customers", restTemplate, serviceUrl, false);
    }
    
}
