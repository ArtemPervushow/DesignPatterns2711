package ru.iteco.cources.structural.decorator;

public class BlackCoffee implements CoffeeComponent {
    @Override
    public void printComponentInfo() {
        System.out.println("Black coffee");
    }

    @Override
    public void enrichComponent(CoffeeCup cup) {
        cup.appendDescription("black coffee");
    }
}
