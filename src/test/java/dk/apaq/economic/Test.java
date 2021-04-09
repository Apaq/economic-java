package dk.apaq.economic;

import dk.apaq.economic.model.*;
import dk.apaq.economic.model.references.ProductReference;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public class Test {

    public static void main(String[] args) {
        
        EconomicClient client = new EconomicClient("slVRGiodS2pKQKcIY0qGS2KVJdqV4tycVXmfvz4y4AM1", "b7zuzDMYtXO4K9UW9k8IlvaUjBVJTQNVIV1tr8HIBac1", "https://restapi.e-conomic.com", true   );
        //EconomicClient client = new EconomicClient("demo", "demo", "https://restapi.e-conomic.com", true   );


        Page<Customer> customers = client.getCustomerResource().findAll(PageRequest.of(0, 2));
        System.out.println(customers);

        Page<Product> products = client.getProductResource().findAll(PageRequest.of(0, 2));
        System.out.println(products);

        DraftInvoice invoice = null;
        Customer customer = customers.getContent().get(0);
        Product product = products.getContent().get(0);

        int paymentTermsNumber = customer.getPaymentTerms().getPaymentTermsNumber();

        invoice = new DraftInvoice();
        invoice.setCurrency("DKK");
        invoice.getReferences().setOther("prv-123123123321");
        invoice.getCustomer().setCustomerNumber(customer.getCustomerNumber());
        invoice.getPaymentTerms().setPaymentTermsNumber(paymentTermsNumber);
        invoice.getNotes().setTextLine1("This is an invoice");

        Recipient r = new Recipient();
        r.setName(customer.getName());
        r.setVatZone(customer.getVatZone());
        r.setAddress(customer.getAddress());
        r.setCity(customer.getCity());
        r.setCountry(customer.getCountry());
        r.setEan(customer.getEan());
        r.setPublicEntryNumber(customer.getPublicEntryNumber());
        r.setZip(customer.getZip());
        invoice.setRecipient(r);


        Layout defaultLayout = null;
        if(defaultLayout == null) {
            Page<Layout> layouts = client.getLayoutResource().findAll(PageRequest.of(0,1));
            defaultLayout = layouts.getContent().size() > 0 ? layouts.getContent().get(0) : null;
        }

        if(defaultLayout != null) {
            invoice.getLayout().setLayoutNumber(defaultLayout.getLayoutNumber());
            invoice.getLayout().setName(defaultLayout.getName());
            invoice.getLayout().setSelf(defaultLayout.getSelf());
        }

        StringBuilder description = new StringBuilder();
        description.append("Previsto Description");

        Line line = new Line();
        line.setDescription(description.toString());
        line.setUnitNetPrice(200.12);
        line.setQuantity(1.0);
/*
        ProductReference pr = new ProductReference();
        pr.setProductNumber(articleIdMap.get(task.getWorkType()));
        line.setProduct(pr);
        invoice.getLines().add(line);


        LOG.debug("Persisting invoice");
        invoice = client.getDraftInvoiceResource().save(invoice);
        System.out.println(invoice.getId());*/
    }
}
