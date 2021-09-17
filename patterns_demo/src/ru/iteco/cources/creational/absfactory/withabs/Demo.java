package ru.iteco.cources.creational.absfactory.withabs;

public class Demo {

    public static void main(String[] args) {
        ProductFactory.getFactory("bag").createProduct();
    }
}
