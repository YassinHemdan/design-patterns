package org.example.solid_principles.OCP.apply;

import org.example.solid_principles.OCP.Product;

public class DiscountCalculator {
    private DiscountStrategy discountStrategy;

    public double calculateDiscount(Product product){
        return discountStrategy.calculateDiscount(product);
    }
}
