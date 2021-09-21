package ru.iteco.cources.structural.composite;

public class Product {

    private final String name;
    private final int calorificValue;

    public Product(String name, int calorificValue) {
        this.name = name;
        this.calorificValue = calorificValue;
    }

    public String getName() {
        return name;
    }

    public int getCalorificValue() {
        return calorificValue;
    }

}
