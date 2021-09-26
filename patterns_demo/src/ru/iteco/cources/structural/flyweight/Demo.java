package ru.iteco.cources.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            productList.add(new Product("Skirt",
                    SizeHolder.getByName("XL"),
                    new Color("red", 123456),
                    new Brand("Armany", "USA", "Armany")));
        }

        List<PurchasedProduct> products = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            products.add(new PurchasedProduct("Artem",
                    "273921739F",
                    productList.get(0)));
        }
    }
}
