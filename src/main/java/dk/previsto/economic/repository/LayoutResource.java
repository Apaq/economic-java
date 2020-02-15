package dk.previsto.economic.repository;

import dk.previsto.economic.model.Account;
import dk.previsto.economic.model.Layout;
import org.springframework.web.client.RestTemplate;

public class LayoutResource extends Resource<Layout>{

    public LayoutResource(RestTemplate restTemplate, String serviceUrl) {
        super(Layout.class, "layouts", restTemplate, serviceUrl, false);
    }
    
}