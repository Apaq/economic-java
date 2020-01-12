package dk.previsto.economic.model;

import dk.previsto.economic.model.references.CustomerContactReference;
import dk.previsto.economic.model.references.VatZoneReference;

public class Recipient {
    private String address;
    private CustomerContactReference attention;
    private String city;
    private String country;
    private String ean;
    private String name;
    private String publicEntryNumber;
    private VatZoneReference vatZone;
    private String zip;
}
