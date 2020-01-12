package dk.previsto.economic.repository;

import dk.previsto.economic.model.BookedInvoice;
import dk.previsto.economic.model.DraftInvoice;
import org.springframework.web.client.RestTemplate;

public class BookedInvoiceResource extends Resource<BookedInvoice>{

    public BookedInvoiceResource(RestTemplate restTemplate, String serviceUrl) {
        super(DraftInvoice.class, "invoices/draft", restTemplate, serviceUrl);
    }

}