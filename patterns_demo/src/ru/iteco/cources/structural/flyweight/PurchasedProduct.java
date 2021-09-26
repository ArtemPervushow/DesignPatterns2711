package ru.iteco.cources.structural.flyweight;

public class PurchasedProduct {
    private String owner;
    private String articul;
    private Product product;

    public PurchasedProduct(String owner, String articul, Product product) {
        this.owner = owner;
        this.articul = articul;
        this.product = product;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getArticul() {
        return articul;
    }

    public void setArticul(String articul) {
        this.articul = articul;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
