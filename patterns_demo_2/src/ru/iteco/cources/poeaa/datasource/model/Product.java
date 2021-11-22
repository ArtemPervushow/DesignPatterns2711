package ru.iteco.cources.poeaa.datasource.model;

import java.util.UUID;

public class Product {
    private UUID uuid;
    private String name;
    private float cost;
    private User owner;

    public Product(UUID uuid, String name, float cost, User owner) {
        this.uuid = uuid;
        this.name = name;
        this.cost = cost;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Product{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", owner=" + owner +
                '}';
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
