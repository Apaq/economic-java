package dk.apaq.economic.model;

import dk.apaq.economic.model.references.CustomerContactReference;
import dk.apaq.economic.model.references.VatZoneReference;

public class Recipient {
    private String address;
    private CustomerContactReference attention;
    private String city;
    private String country;
    private String ean;
    private String name = "";
    private String publicEntryNumber;
    private VatZoneReference vatZone = new VatZoneReference();
    private String zip;

    public String getAddress() {
        return address;
    }

    /**
     * The street address of the actual recipient.
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerContactReference getAttention() {
        return attention;
    }

    /**
     * The person to whom this invoice is addressed.
     * @param attention
     */
    public void setAttention(CustomerContactReference attention) {
        this.attention = attention;
    }

    public String getCity() {
        return city;
    }

    /**
     * The city of the actual recipient.
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    /**
     * The country of the actual recipient.
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    public String getEan() {
        return ean;
    }

    /**
     * The 'European Article Number’ of the actual recipient.
     * @param ean
     */
    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getName() {
        return name;
    }

    /**
     * 	The name of the actual recipient.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getPublicEntryNumber() {
        return publicEntryNumber;
    }

    /**
     * The public entry number of the actual recipient.
     * @param publicEntryNumber
     */
    public void setPublicEntryNumber(String publicEntryNumber) {
        this.publicEntryNumber = publicEntryNumber;
    }

    public VatZoneReference getVatZone() {
        return vatZone;
    }

    /**
     * Recipient vat zone.
     * @param vatZone
     */
    public void setVatZone(VatZoneReference vatZone) {
        this.vatZone = vatZone;
    }

    public String getZip() {
        return zip;
    }

    /**
     * The zip code of the actual recipient.
     * @param zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }
}
