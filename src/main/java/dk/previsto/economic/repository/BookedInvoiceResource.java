package dk.previsto.economic.repository;

import dk.previsto.economic.model.BookedInvoice;
import dk.previsto.economic.model.DraftInvoice;
import org.springframework.web.client.RestTemplate;

public class BookedInvoiceResource extends Resource<BookedInvoice>{

    public BookedInvoiceResource(RestTemplate restTemplate, String serviceUrl) {
        super(BookedInvoice.class, "invoices/booked", restTemplate, serviceUrl, false);
    }

}