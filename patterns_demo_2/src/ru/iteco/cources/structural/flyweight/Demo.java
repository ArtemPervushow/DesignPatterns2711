package ru.iteco.cources.structural.flyweight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            productList.add(ProductFactory
                    .createProduct("XXXL", "red", "mokasiny"));
        }

        List<Purchase> purchaseList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            purchaseList.add(new Purchase("Artem", 1000f, productList.get(0)));
        }
    }
}
