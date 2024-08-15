package org.example.solid_principles.OCP.violation;

import org.example.solid_principles.OCP.Product;

public class DiscountCalculator {
    // this method violates the OCP
    // what if I wanted in the future to support other types for discounts
    // in that case, I will change the method's code to add the new types
    // The OCP principle states that a class should me Open for extension, Closed for modification
    public double calculateDiscount(Product product){
        return switch (product.getType()) {
            case "electronics" -> product.getPrice() * 0.1;
            case "clothes" -> product.getPrice() * 0.2;
            case "books" -> product.getPrice() * 0.15;
            default -> 0.0;
        };
    }
}
