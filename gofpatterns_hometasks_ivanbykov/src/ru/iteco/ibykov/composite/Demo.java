package ru.iteco.ibykov.composite;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        try {
            MenuItem broccoli = new MenuItem("Broko", "", true, 100.0, 50);
            MenuItem beefSteak = new MenuItem("Beef", "Steak", false, 1500.0, 300);
            MenuItem porkSteak = new MenuItem("Pork", "steak", false, 900.0, 800);
            Waitress kate = new Waitress();
            BistroMenu bistroMenu = new BistroMenu();

            kate.addMenuItemToOrder(porkSteak);
            kate.addMenuItemToOrder(broccoli);
            System.out.println(kate.countCalories());
        }catch(Exception e) {e.printStackTrace();}
    }
}
