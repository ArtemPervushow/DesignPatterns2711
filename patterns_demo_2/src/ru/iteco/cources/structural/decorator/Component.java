package ru.iteco.cources.structural.decorator;

public abstract class Component implements CoffeeComponent {
    private CoffeeComponent innerComponent;

    public Component(CoffeeComponent innerComponent) {
        this.innerComponent = innerComponent;
    }

    @Override
    public void printComponentInfo() {
        //if(innerComponent != null) TODO: don't need base component
        innerComponent.printComponentInfo();
    }

    @Override
    public void enrichComponent(CoffeeCup cup) {
        //if(innerComponent != null) TODO: don't need base component
        innerComponent.enrichComponent(cup);
    }
}
