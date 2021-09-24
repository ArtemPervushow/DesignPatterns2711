package ru.iteco.cources.structural.decorator;

public class Milk extends Component {
    public Milk(CoffeeComponent innerComponent) {
        super(innerComponent);
    }

    @Override
    public void printComponentInfo() {
        super.printComponentInfo();
        System.out.println("Milk inside");
    }

    @Override
    public void enrichComponent(CoffeeCup cup) {
        super.enrichComponent(cup);
        cup.appendDescription("little bit milk");
    }
}
