package ru.iteco.cources.behavioral.observer.real;

public class Order {
    private String descriptionOnProducts;
    private float cost;

    public Order(String descriptionOnProducts, float cost) {
        this.descriptionOnProducts = descriptionOnProducts;
        this.cost = cost;
    }

    public String getDescriptionOnProducts() {
        return descriptionOnProducts;
    }

    public void setDescriptionOnProducts(String descriptionOnProducts) {
        this.descriptionOnProducts = descriptionOnProducts;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "descriptionOnProducts='" + descriptionOnProducts + '\'' +
                ", cost=" + cost +
                '}';
    }
}
