package ru.iteco.cources.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Country /*implements CitizenCounter*/ extends CounterOfCitizens {
    //private List<City> cityList = new ArrayList<>();
    private int countOfMilitaries;

    public Country(int countOfMilitaries) {
        this.countOfMilitaries = countOfMilitaries;
    }

    public void addCity(City city) {
        counterList.add(city);
    }

    @Override
    public int countCitizens() {
        /*int count = 0;
        for (City city:
             cityList) {
            count += city.countCitizens();
        }*/
        int count = super.countCitizens();

        return count + countOfMilitaries;
    }
}
