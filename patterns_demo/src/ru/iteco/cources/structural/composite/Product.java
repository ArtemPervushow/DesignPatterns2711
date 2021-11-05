package ru.iteco.cources.structural.composite;

public class Product {

    private final String name;
    private final double calorificContent;

    public Product(String name, double calorificContent) {
        this.name = name;
        this.calorificContent = calorificContent;
    }

    public String getName() {
        return name;
    }

    public double getCalorificContent() {
        return calorificContent;
    }

}
