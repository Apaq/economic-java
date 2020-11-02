package dk.apaq.economic.model;

import dk.apaq.economic.model.references.DeliveryLocationReference;

import java.time.LocalDate;

public class Delivery {
    private String address;
    private String country;
    private String city;
    private LocalDate deliveryDate;
    private String deliveryTerms;
    private String zip;
    private DeliveryLocationReference deliveryLocation;

    public String getAddress() {
        return address;
    }

    /**
     * Street address where the goods must be delivered to the customer.
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    /**
     * The country of the place of delivery
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * The date of delivery.
     * @param deliveryDate
     */
    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Details about the terms of delivery.
     * @param deliveryTerms
     */
    public void setDeliveryTerms(String deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    public String getZip() {
        return zip;
    }

    /**
     * The zip code of the place of delivery.
     * @param zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    /**
     * The city of the place of delivery
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    public DeliveryLocationReference getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(DeliveryLocationReference deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }
}
