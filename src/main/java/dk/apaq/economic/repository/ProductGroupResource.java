package dk.apaq.economic.repository;

import dk.apaq.economic.model.ProductGroup;
import org.springframework.web.client.RestTemplate;

public class ProductGroupResource extends Resource<ProductGroup>{

    public ProductGroupResource(RestTemplate restTemplate, String serviceUrl) {
        super(ProductGroup.class, "product-groups", restTemplate, serviceUrl, false);
    }
    
}