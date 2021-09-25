package ru.iteco.cources.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(ProductCreator.createProduct("Bag"));
        products.add(ProductCreator.createProduct("Mobile"));
    }
}
