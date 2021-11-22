package ru.iteco.cources.poeaa.sessionstate.databaseside;

public class ShopFrontend {
    private ShopBackend shopBackend;

    public ShopFrontend(ShopBackend shopBackend) {
        this.shopBackend = shopBackend;
    }

    public void addProductRequest(String product){
        shopBackend.processAddProduct(product);
    }
}
