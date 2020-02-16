package dk.previsto.economic.model;

import dk.previsto.economic.model.references.DraftInvoiceReference;

public class BookInvoiceRequest {
    private DraftInvoiceReference draftInvoice;

    public DraftInvoiceReference getDraftInvoice() {
        return draftInvoice;
    }

    public void setDraftInvoice(DraftInvoiceReference draftInvoice) {
        this.draftInvoice = draftInvoice;
    }
}
