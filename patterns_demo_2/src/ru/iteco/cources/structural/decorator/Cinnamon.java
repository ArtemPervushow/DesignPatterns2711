package ru.iteco.cources.structural.decorator;

public class Cinnamon extends Component {
    public Cinnamon(CoffeeComponent innerComponent) {
        super(innerComponent);
    }

    @Override
    public void printComponentInfo() {
        super.printComponentInfo();
        System.out.println("Cinnamon inside");
    }

    @Override
    public void enrichComponent(CoffeeCup cup) {
        super.enrichComponent(cup);
        cup.appendDescription(" peace of cinnamon");
    }
}
