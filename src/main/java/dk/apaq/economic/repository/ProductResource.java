package dk.apaq.economic.repository;

import dk.apaq.economic.model.Product;
import org.springframework.web.client.RestTemplate;

public class ProductResource extends Resource<Product>{

    public ProductResource(RestTemplate restTemplate, String serviceUrl) {
        super(Product.class, "products", restTemplate, serviceUrl, false);
    }
    
}