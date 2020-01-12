package dk.previsto.economic.model;

import dk.previsto.economic.model.references.DepartmentalDistributionReference;
import dk.previsto.economic.model.references.ProductReference;

import java.time.LocalDate;

public class Line {
    private LocalDate deliveryDate;
    private DepartmentalDistributionReference departmentalDistribution;
    private String description;
    private double discountPercentage;
    private int lineNumber;
    private ProductReference product;
    private double quantity;
    private int sortKey;
    private double totalNetAmount;

}
