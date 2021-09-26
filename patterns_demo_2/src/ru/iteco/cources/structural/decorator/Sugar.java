package ru.iteco.cources.structural.decorator;

public class Sugar extends Component {
    public Sugar(CoffeeComponent innerComponent) {
        super(innerComponent);
    }

    @Override
    public void printComponentInfo() {
        super.printComponentInfo();
        System.out.println("Sugar inside");
    }

    @Override
    public void enrichComponent(CoffeeCup cup) {
        super.enrichComponent(cup);
        cup.appendDescription(" some sugar");
    }
}
