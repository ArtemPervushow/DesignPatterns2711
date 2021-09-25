package ru.iteco.cources.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Street /*implements CitizenCounter*/ extends CounterOfCitizens {
    //private List<House> houseList = new ArrayList<>();
    private int homeless;

    public Street(int homeless) {
        this.homeless = homeless;
    }

    public void addHouse(House house){
        //houseList.add(house);
        counterList.add(house);
    }

    @Override
    public int countCitizens() {
        /*int count = 0;
        for (House house:
                houseList) {
            count += house.countCitizens();
        }*/
        int count = super.countCitizens();

        return count + homeless;
    }
}
