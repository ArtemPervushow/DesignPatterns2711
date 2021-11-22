package ru.iteco.cources.poeaa.sessions;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<String> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public void addProduct(String product){
        products.add(product);
    }

    public List<String> getProducts() {
        return products;
    }
}
