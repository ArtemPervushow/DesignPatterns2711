package ru.iteco.cources.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Waitress implements MenuItem {

    private List<MenuItem> orders = new ArrayList<>();


    public void addMenuItemToOrder(MenuItem item) {
        orders.add(item);
    }

    public void removeMenuItemFromOrder(MenuItem item) {
        orders.remove(item);
    }

    public List<MenuItemImpl> getCurrentOrder() {
        return null;
    }


    public int calcCalories() {
        int sumCall = 0;
        for (MenuItem order : orders) {
            sumCall += order.calcCalories();
        }
        return sumCall;
    }
}

