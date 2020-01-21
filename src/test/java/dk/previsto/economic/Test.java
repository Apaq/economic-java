package dk.previsto.economic;

import dk.previsto.economic.model.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public class Test {

    public static void main(String[] args) {
        
        //EconomicClient client = new EconomicClient("dd1xzmMlyT0fqvMSA33z0wBY61ZaPgAZbqUud9FmqTo1", "", "https://restapi.e-conomic.com", true   );
        EconomicClient client = new EconomicClient("demo", "demo", "https://restapi.e-conomic.com", true   );


        Page<Customer> customers = client.getCustomerResource().findAll(new PageRequest(0, 2));
        System.out.println(customers);

        Page<Product> products = client.getProductResource().findAll(new PageRequest(0, 2));
        System.out.println(products);

        Page<DraftInvoice> draftInvoices = client.getDraftInvoiceResource().findAll(new PageRequest(0, 2));
        System.out.println(draftInvoices);

        Line line = new Line();
        line.setDescription("Vinduespudsning");
        //line.setQuantity(1);
        //line.setUnitNetPrice(200.0);
        line.setTotalNetAmount(200.0);
        line.setVatRate(25.0);
        DraftInvoice draftInvoice = new DraftInvoice();
        draftInvoice.getCustomer().setCustomerNumber(customers.getContent().get(0).getCustomerNumber());
        draftInvoice.setCurrency("DKK");
        draftInvoice.getLines().add(line);
        draftInvoice.getLayout().setLayoutNumber(19);
        draftInvoice.getRecipient().setName("John Doe");
        draftInvoice.getRecipient().getVatZone().setVatZoneNumber(1);
        draftInvoice.getPaymentTerms().setPaymentTermsNumber(1);
        draftInvoice.getReferences().setOther(UUID.randomUUID().toString());
        draftInvoice = client.getDraftInvoiceResource().save(draftInvoice);
        System.out.println(draftInvoice.getId());
    }
}
