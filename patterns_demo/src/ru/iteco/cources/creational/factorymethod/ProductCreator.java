package ru.iteco.cources.creational.factorymethod;

public class ProductCreator {
    public static Product createProduct(String type) {
        switch (type) {
            case "Bag":
                return Bag.createProduct();
            default:
                return MobilePhone.createProduct();
        }
    }
}
