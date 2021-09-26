package ru.iteco.cources.structural.decorator;

public class Demo {
    public static void main(String[] args) {
        BlackCoffee coffee = new BlackCoffee();
        Component component = new Sugar(coffee);
        //Component component2 = new Milk(component);
        Component component3 = new Cinnamon(component);
        Component component4 = new Cinnamon(component3);

        component4.printComponentInfo();

        CoffeeCup cup = new CoffeeCup();
        component4.enrichComponent(cup);

        System.out.println(cup);
    }
}
