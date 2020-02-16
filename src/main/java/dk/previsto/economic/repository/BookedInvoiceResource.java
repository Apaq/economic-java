package dk.previsto.economic.repository;

import dk.previsto.economic.exception.RequestException;
import dk.previsto.economic.model.BookInvoiceRequest;
import dk.previsto.economic.model.BookedInvoice;
import dk.previsto.economic.model.DraftInvoice;
import dk.previsto.economic.model.references.DraftInvoiceReference;
import org.springframework.data.domain.Persistable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class BookedInvoiceResource extends Resource<BookedInvoice>{

    public BookedInvoiceResource(RestTemplate restTemplate, String serviceUrl) {
        super(BookedInvoice.class, "invoices/booked", restTemplate, serviceUrl, false);
    }

    public BookedInvoice save(DraftInvoice draftInvoice) {
        return save(draftInvoice, null);
    }

    public BookedInvoice save(DraftInvoice draftInvoice, Integer bookWithNumber) {
        URI uri = buildUri();
        BookedInvoice persistedEntity;

        BookInvoiceRequest bookInvoiceRequest = new BookInvoiceRequest();
        DraftInvoiceReference ref = new DraftInvoiceReference();
        ref.setDraftInvoiceNumber(draftInvoice.getDraftInvoiceNumber());
        ref.setSelf(draftInvoice.getSelf());
        bookInvoiceRequest.setDraftInvoice(ref);

        ResponseEntity<BookedInvoice> response = restTemplate.postForEntity(uri, bookInvoiceRequest, BookedInvoice.class);
        persistedEntity = response.getBody();

        return persistedEntity;
    }
}