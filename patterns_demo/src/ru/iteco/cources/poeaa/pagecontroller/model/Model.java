package ru.iteco.cources.poeaa.pagecontroller.model;

import java.util.HashMap;
import java.util.Map;

public class Model {
    private Map<String, User> userMap = new HashMap<>();
    private Map<String, Product> productMap = new HashMap<>();

    public User getUserByName(String name) {
        return userMap.get(name);
    }

    public void addUser(User user) {
        userMap.put(user.getName(), user);
    }

    public Product getProductByName(String name) {
        return productMap.get(name);
    }

    public void addProduct(Product product) {
        productMap.put(product.getName(), product);
    }
}
