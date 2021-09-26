package ru.iteco.cources.structural.facade;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Product, Integer> productMap = new HashMap<>();
    private String customerName;

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productMap=" + productMap +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
