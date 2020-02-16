package dk.previsto.economic.model.references;

public class DraftInvoiceReference {
    private Integer draftInvoiceNumber;
    private String self;

    public Integer getDraftInvoiceNumber() {
        return draftInvoiceNumber;
    }

    public void setDraftInvoiceNumber(Integer draftInvoiceNumber) {
        this.draftInvoiceNumber = draftInvoiceNumber;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}
