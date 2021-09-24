package ru.iteco.cources.structural.composite;

public class House implements CitizenCounter {
    private int countOfCitizens;

    public House(int countOfCitizens) {
        this.countOfCitizens = countOfCitizens;
    }

    @Override
    public int countCitizens() {
        return countOfCitizens;
    }
}
