package ru.iteco.cources.khmil.dz3;

import java.util.ArrayList;
import java.util.List;

public class Waitress {
    List<MenuItem> order = new ArrayList<>();

    public void addMenuItemToOrder(MenuItem item) {
        order.add(item);
    }

    public void removeMenuItemFromOrder(MenuItem item) {
        order.remove(item);
    }

    public List<MenuItem> getCurrentOrder() {
        return order;
    }

}
