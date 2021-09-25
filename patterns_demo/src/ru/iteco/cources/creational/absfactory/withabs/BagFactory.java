package ru.iteco.cources.creational.absfactory.withabs;

import ru.iteco.cources.creational.absfactory.model.Bag;
import ru.iteco.cources.creational.absfactory.model.Product;

public class BagFactory extends ProductFactory {
    @Override
    public Product createProduct() {
        return Bag.createProduct();
    }
}
