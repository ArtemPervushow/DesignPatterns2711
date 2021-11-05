package ru.iteco.cources.structural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Waitress {

    private final List<MenuItem> order = new ArrayList<>();

    public void addMenuItemToOrder(MenuItem menuItem) {
        order.add(menuItem);
    }

    public void removeMenuItemFromOrder(MenuItem menuItem) {
        order.remove(menuItem);
    }

    public List<MenuItem> getCurrentOrder() {
        return Collections.unmodifiableList(order);
    }

}
