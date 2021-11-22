package ru.iteco.cources.poeaa.datasource;

import java.util.UUID;

public class Product {
    private UUID uuid;
    private String name;
    private float cost;
    private int count;
    private UUID ownerUUID;

    public Product(UUID uuid, String name, float cost, int count, UUID ownerUUID) {
        this.uuid = uuid;
        this.name = name;
        this.cost = cost;
        this.count = count;
        this.ownerUUID = ownerUUID;
    }

    public UUID getOwnerUUID() {
        return ownerUUID;
    }

    public void setOwnerUUID(UUID ownerUUID) {
        this.ownerUUID = ownerUUID;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", count=" + count +
                ", ownerUUID=" + ownerUUID +
                '}';
    }
}
