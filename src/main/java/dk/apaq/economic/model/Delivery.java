package dk.apaq.economic.model;

import dk.apaq.economic.model.references.DeliveryLocationReference;

import java.time.LocalDate;

public class Delivery {
    private String address;
    private String country;
    private LocalDate deliveryDate;
    private String deliveryTerms;
    private String zip;
    private DeliveryLocationReference deliveryLocation;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryTerms() {
        return deliveryTerms;
    }

    public void setDeliveryTerms(String deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public DeliveryLocationReference getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(DeliveryLocationReference deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }
}
