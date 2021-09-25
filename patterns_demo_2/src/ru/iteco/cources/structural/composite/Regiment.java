package ru.iteco.cources.structural.composite;

public class Regiment implements ArmyCounter {
    private int countOfSoldiers;

    public Regiment(int countOfSoldiers) {
        this.countOfSoldiers = countOfSoldiers;
    }

    @Override
    public int countSoldiers() {
        return countOfSoldiers;
    }
}
