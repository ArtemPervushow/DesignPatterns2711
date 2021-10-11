package ru.iteco.cources.khmil.dz3;

import java.util.ArrayList;
import java.util.List;

public class BistroMenu extends MenuItem implements CalorieCounter, ProfitCount {

    private List<MenuItem> items;

    public BistroMenu(String name, String description, boolean vegetarian, double price, List<MenuItem> items) {
        super(name, description, vegetarian, price);
        this.items = items;
    }

    public List<MenuItem> getMenuItems() {
        return items;
    }

    @Override
    public int countCalories() {
        for (MenuItem item : items) {
            this.calories += item.calories;
        }
        return this.calories;
    }

    @Override
    public double profitCount() {
        double profit = 0;
        for (MenuItem item : items) {
            profit+=item.getPrice();
        }
        return profit - this.price;
    }
}
