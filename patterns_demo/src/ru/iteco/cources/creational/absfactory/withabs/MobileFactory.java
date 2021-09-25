package ru.iteco.cources.creational.absfactory.withabs;

import ru.iteco.cources.creational.absfactory.model.MobilePhone;
import ru.iteco.cources.creational.absfactory.model.Product;

public class MobileFactory extends ProductFactory {
    @Override
    public Product createProduct() {
        return MobilePhone.createProduct();
    }
}
