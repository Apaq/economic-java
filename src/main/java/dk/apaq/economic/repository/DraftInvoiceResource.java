package dk.apaq.economic.repository;

import dk.apaq.economic.model.DraftInvoice;
import org.springframework.web.client.RestTemplate;

public class DraftInvoiceResource extends Resource<DraftInvoice>{

    public DraftInvoiceResource(RestTemplate restTemplate, String serviceUrl) {
        super(DraftInvoice.class, "invoices/drafts", restTemplate, serviceUrl, true);
    }

}