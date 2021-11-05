package ru.iteco.cources.structural.composite;

import java.util.List;

public class MenuItem {

    protected final String name;
    protected final String description;
    protected final boolean vegetarian;
    protected final double price;
    protected final List<Product> products;
    protected final List<MenuItem> menuItems;

    public MenuItem(
            String name,
            String description,
            boolean vegetarian,
            double price,
            List<MenuItem> menuItems,
            List<Product> products) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
        this.menuItems = menuItems;
        this.products = products;
    }

    public double getCalorificContent() {
        double calories = 0;
        for (MenuItem subItem : menuItems) {
            calories = calories + subItem.getCalorificContent();
        }
        for (Product product : products) {
            calories = calories + product.getCalorificContent();
        }
        return calories;
    }
}
