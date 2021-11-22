package ru.iteco.cources.poeaa.sessionstate.clientside;

import ru.iteco.cources.poeaa.sessionstate.Basket;

public class ShopFrontend {
    private ShopBackend shopBackend;
    //+Could be only one
    //+Simple
    //-Overhead client
    //-close front=lose session
    private Basket basket = new Basket();

    public ShopFrontend(ShopBackend shopBackend) {
        this.shopBackend = shopBackend;
    }

    public void addProductRequest(String product){
        shopBackend.processAddProduct(product);
        basket.addProduct(product);
    }
}
