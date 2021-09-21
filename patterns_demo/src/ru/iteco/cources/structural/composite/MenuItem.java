package ru.iteco.cources.structural.composite;

import java.util.List;

public class MenuItem {

    protected final String name;
    protected final String description;
    protected final boolean vegetarian;
    protected final double price;
    protected final List<MenuItem> menuItems;
    protected final List<Product> products;

    public MenuItem(
            String name,
            String description,
            boolean vegetarian,
            double price,
            List<MenuItem> menuItems,
            List<Product> products
    ) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
        this.menuItems = menuItems;
        this.products = products;
    }

    protected int calculateCalorificValue() {
        int caloriesCounter = 0;
        for (MenuItem subItem : menuItems) {
            caloriesCounter += subItem.calculateCalorificValue();
        }
        for (Product product : products) {
            caloriesCounter += product.getCalorificValue();
        }
        return caloriesCounter;
    }

}
