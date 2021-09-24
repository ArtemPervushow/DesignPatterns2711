package ru.iteco.cources.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Corps /*implements ArmyCounter*/ extends SoldierCounter {
    //private List<Division> divisionList = new ArrayList<>();
    private int countOfGeneral;

    public Corps(int countOfGeneral) {
        this.countOfGeneral = countOfGeneral;
    }

    public void addDivision(Division division) {
        //divisionList.add(division);
        counterList.add(division);
    }

    @Override
    public int countSoldiers() {
        /*int count = 0;
        for (Division division:
             divisionList) {
            count += division.countSoldiers();
        }*/
        int count = super.countSoldiers();

        return count + countOfGeneral;
    }
}
