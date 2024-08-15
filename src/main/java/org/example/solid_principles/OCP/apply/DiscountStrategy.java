package org.example.solid_principles.OCP.apply;

import org.example.solid_principles.OCP.Product;

public interface DiscountStrategy {
    double calculateDiscount(Product product);
}
