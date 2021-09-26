package ru.iteco.cources.structural.composite;

import java.util.List;

public class MenuItemImpl implements MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
    private int calories;
    public MenuItemImpl(String name, String description, boolean vegetarian, double price, int calories) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
        this.calories = calories;
    }

    public int calcCalories() {
        return calories;
    }
}
