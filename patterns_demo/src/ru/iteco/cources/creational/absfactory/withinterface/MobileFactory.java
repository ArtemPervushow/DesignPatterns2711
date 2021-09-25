package ru.iteco.cources.creational.absfactory.withinterface;

import ru.iteco.cources.creational.absfactory.model.MobilePhone;
import ru.iteco.cources.creational.absfactory.model.Product;

public class MobileFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return MobilePhone.createProduct();
    }
}
