package ru.iteco.cources.poeaa.sessionstate;

public class ShopBackend {
    private ShopDatabase shopDatabase;

    public ShopBackend(ShopDatabase shopDatabase) {
        this.shopDatabase = shopDatabase;
    }

    public void processAddProduct(String product) {
        shopDatabase.storeProductAdding(product);
    }
}
