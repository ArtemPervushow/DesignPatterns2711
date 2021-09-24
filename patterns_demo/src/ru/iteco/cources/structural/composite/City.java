package ru.iteco.cources.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class City /*implements CitizenCounter*/ extends CounterOfCitizens {
    //private List<Street> streetList = new ArrayList<>();
    private int countOfTourists;

    public City(int countOfTourists) {
        this.countOfTourists = countOfTourists;
    }

    public void addStreet(Street street) {
        counterList.add(street);
    }

    @Override
    public int countCitizens() {
        /*int count = 0;
        for (Street street:
                streetList) {
            count += street.countCitizens();
        }*/
        int count = super.countCitizens();

        return count + countOfTourists;
    }
}
