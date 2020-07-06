package dk.apaq.economic.model;

import dk.apaq.economic.model.references.DraftInvoiceReference;

public class BookInvoiceRequest {
    private DraftInvoiceReference draftInvoice;

    public DraftInvoiceReference getDraftInvoice() {
        return draftInvoice;
    }

    public void setDraftInvoice(DraftInvoiceReference draftInvoice) {
        this.draftInvoice = draftInvoice;
    }
}
