package ru.iteco.cources.creational.factorymethod;

public class Bag extends Product {
    private String size;

    private Bag(String size) {
        this.size = size;
    }

    @Override
    public String getInfo() {
        return "Bag size of " + size;
    }

    public static Product createProduct() {
        return new Bag("XXl");
    }
}
