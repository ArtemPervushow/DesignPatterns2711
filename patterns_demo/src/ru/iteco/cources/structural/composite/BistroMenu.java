package ru.iteco.cources.structural.composite;

import java.util.Collections;
import java.util.List;

public class BistroMenu extends MenuItem {

    public BistroMenu(List<MenuItem> menuItems) {
        super("Bistro",
                "Description for a menu item such is a Bistro",
                false,
                menuItems.stream().mapToDouble(m -> m.price).sum(),
                menuItems,
                Collections.emptyList());
    }

}