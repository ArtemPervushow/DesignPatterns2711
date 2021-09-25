package ru.iteco.cources.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Division /*implements ArmyCounter*/ extends SoldierCounter {
    //private List<Regiment> regimentList = new ArrayList<>();
    private int countOfCollonel;

    public Division(int countOfCollonel) {
        this.countOfCollonel = countOfCollonel;
    }

    public void addRegiment(Regiment regiment) {
        //regimentList.add(regiment);
        counterList.add(regiment);
    }

    @Override
    public int countSoldiers() {
        /*int count = 0;
        for (Regiment regiment:
             regimentList) {
            count += regiment.countSoldiers();
        }*/
        int count = super.countSoldiers();

        return count + countOfCollonel;
    }
}
