package ru.iteco.cources.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BistroMenu implements MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
    public BistroMenu(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    private List<MenuItemImpl> items = new ArrayList<>();


    public List<MenuItemImpl> getMenuItems() {
        return null;
    }

    public void addItem(MenuItemImpl item) {
        items.add(item);
    }

    @Override
    public int calcCalories() {
        int sumCall = 0;
        for (MenuItemImpl item: items) {
            sumCall += item.calcCalories();
        }
        return sumCall;
    }
}
