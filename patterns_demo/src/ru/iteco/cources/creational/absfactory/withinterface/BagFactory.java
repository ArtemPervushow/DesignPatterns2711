package ru.iteco.cources.creational.absfactory.withinterface;

import ru.iteco.cources.creational.absfactory.model.Bag;
import ru.iteco.cources.creational.absfactory.model.Product;

public class BagFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return Bag.createProduct();
    }
}
