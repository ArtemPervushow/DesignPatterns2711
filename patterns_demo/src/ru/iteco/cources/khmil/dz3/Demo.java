package ru.iteco.cources.khmil.dz3;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        FriedEgg friedEgg = new FriedEgg("Fried egg", "Egg fried on pan", false, 50, 150);
        Tomatoes tomatoes = new Tomatoes("Tomato", "100 gr", true, 20, 25);
        Beacon beacon = new Beacon("Beacon", "100 gr",false,  55, 200);
        Toast toast= new Toast("Toast", "white bread", true, 10, 60);
        Coffee coffee = new Coffee("Blask coffee", "200 ml", true, 50, 100);

        List<MenuItem> breakfast = new ArrayList<>();
        breakfast.add(friedEgg);
        breakfast.add(friedEgg);
        breakfast.add(toast);
        breakfast.add(toast);
        breakfast.add(tomatoes);
        breakfast.add(beacon);
        breakfast.add(coffee);

        BistroMenu bistroMenu = new BistroMenu("Breakfast","2 Fried eggs with tomatoes and beacon, 2 toasts, 1 black coffee", false, 200, breakfast);
        System.out.println(bistroMenu.countCalories());
        System.out.println(bistroMenu.profitCount());
    }
}
