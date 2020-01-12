package dk.previsto.economic.model;

import dk.previsto.economic.model.references.DeliveryLocationReference;

import java.time.LocalDate;

public class Delivery {
    private String address;
    private String country;
    private LocalDate deliveryDate;
    private String deliveryTerms;
    private String zip;
    private DeliveryLocationReference deliveryLocation;
    
}
