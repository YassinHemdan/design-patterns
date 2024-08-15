package org.example.solid_principles.OCP.apply;

import org.example.solid_principles.OCP.Product;

public class BooksDiscountStrategy implements DiscountStrategy{
    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.15;
    }
}
