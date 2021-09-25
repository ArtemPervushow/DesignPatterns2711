package ru.iteco.cources.creational.absfactory.withabs;

import ru.iteco.cources.creational.absfactory.model.Product;

public abstract class ProductFactory {
    public abstract Product createProduct();

    public static ProductFactory getFactory(String type){
        switch (type) {
            case "Bag":
                return new BagFactory();
            default:
                return new MobileFactory();
        }
    }
}
