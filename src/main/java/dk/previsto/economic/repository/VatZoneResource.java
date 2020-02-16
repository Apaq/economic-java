package dk.previsto.economic.repository;

import dk.previsto.economic.model.Account;
import dk.previsto.economic.model.VatZone;
import org.springframework.web.client.RestTemplate;

public class VatZoneResource extends Resource<VatZone>{

    public VatZoneResource(RestTemplate restTemplate, String serviceUrl) {
        super(VatZone.class, "vat-zones", restTemplate, serviceUrl, false);
    }
    
}