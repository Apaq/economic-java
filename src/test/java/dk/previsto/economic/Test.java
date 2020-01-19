package dk.previsto.economic;

import dk.previsto.economic.model.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class Test {

    public static void main(String[] args) {
        
        //EconomicClient client = new EconomicClient("dd1xzmMlyT0fqvMSA33z0wBY61ZaPgAZbqUud9FmqTo1", "", "https://restapi.e-conomic.com", true   );
        EconomicClient client = new EconomicClient("demo", "demo", "https://restapi.e-conomic.com", true   );


        Page<Customer> customers = client.getCustomerResource().findAll(new PageRequest(0, 2));
        System.out.println(customers);

        Page<Product> products = client.getProductResource().findAll(new PageRequest(0, 2));
        System.out.println(products);

        Page<DraftInvoice> draftInvoices = client.getDraftInvoiceResource().findAll(new PageRequest(0, 2));
        System.out.println(products);

    }
}
