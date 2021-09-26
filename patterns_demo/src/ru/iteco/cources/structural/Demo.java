package ru.iteco.cources.structural;

import ru.iteco.cources.structural.composite.*;
import ru.iteco.cources.structural.composite.MenuItemImpl;

public class Demo {
    public static void main(String[] args) {
        MenuItem pork = new MenuItemImpl("pork", "roast pork", false,210, 290);
        MenuItem chicken = new MenuItemImpl("chicken", "boiled chicken", false, 150, 140);
        MenuItem tomatoes = new MenuItemImpl("tomatoes", "fresh tomatoes", true,  80,20);
        MenuItem spinach = new MenuItemImpl("spinach", "fresh spinach", true, 50, 20);
        MenuItem cheese = new MenuItemImpl("cheese", "parmesan cheene", false, 320, 490);
        MenuItem bread = new MenuItemImpl("bread", "parmesan cheene", false, 320, 490);

        MenuItem bistro = new BistroMenu("bread", "piece of bread", true, 10);
        ((BistroMenu) bistro).addItem((MenuItemImpl) bread);
        ((BistroMenu) bistro).addItem((MenuItemImpl)cheese);

        Waitress waitress = new Waitress();
        waitress.addMenuItemToOrder(pork);
        waitress.addMenuItemToOrder(tomatoes);
        waitress.addMenuItemToOrder(bistro);

        System.out.println(waitress.calcCalories());
    }
}
