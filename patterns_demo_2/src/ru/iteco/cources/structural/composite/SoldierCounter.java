package ru.iteco.cources.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class SoldierCounter implements ArmyCounter {
    protected List<ArmyCounter> counterList = new ArrayList<>();

    @Override
    public int countSoldiers() {
        int count = 0;
        for (ArmyCounter counter:
             counterList) {
            count += counter.countSoldiers();
        }
        return count;
    }
}
