package dk.previsto.economic.repository;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import dk.previsto.economic.model.DraftInvoice;
import org.springframework.web.client.RestTemplate;

public class DraftInvoiceResource extends Resource<DraftInvoice>{

    public DraftInvoiceResource(RestTemplate restTemplate, String serviceUrl) {
        super(DraftInvoice.class, "invoices/draft", restTemplate, serviceUrl);
    }

}