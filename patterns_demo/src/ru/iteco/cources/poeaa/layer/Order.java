package ru.iteco.cources.poeaa.layer;

import java.util.ArrayList;

public class Order {
    private long id;
    private ArrayList<Product> products = new ArrayList<>();
    private float cost;

    public Order(long id, float cost) {
        this.id = id;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                ", cost=" + cost +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
