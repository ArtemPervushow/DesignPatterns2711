package ru.iteco.cources.poeaa.sessionstate;

import java.util.LinkedList;

public class Basket {
    private LinkedList<String> products = new LinkedList<>();

    public void addProduct(String product) {
        products.add(product);
    }
}
