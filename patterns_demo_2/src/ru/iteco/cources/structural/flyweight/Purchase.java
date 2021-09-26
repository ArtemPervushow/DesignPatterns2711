package ru.iteco.cources.structural.flyweight;

public class Purchase {
    private String owner;
    private float cost;
    private Product product;

    public Purchase(String owner, float cost, Product product) {
        this.owner = owner;
        this.cost = cost;
        this.product = product;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
