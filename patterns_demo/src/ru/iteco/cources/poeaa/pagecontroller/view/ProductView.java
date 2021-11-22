package ru.iteco.cources.poeaa.pagecontroller.view;

import ru.iteco.cources.poeaa.pagecontroller.model.Product;

public class ProductView {
    public void showProduct(Product product) {
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getCount());
    }
}
