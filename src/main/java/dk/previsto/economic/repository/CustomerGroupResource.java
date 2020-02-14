package dk.previsto.economic.repository;

import dk.previsto.economic.model.Customer;
import dk.previsto.economic.model.CustomerGroup;
import org.springframework.web.client.RestTemplate;

public class CustomerGroupResource extends Resource<CustomerGroup>{

    public CustomerGroupResource(RestTemplate restTemplate, String serviceUrl) {
        super(CustomerGroup.class, "customer-groups", restTemplate, serviceUrl, false);
    }
    
}
