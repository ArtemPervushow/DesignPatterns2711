package ru.iteco.cources.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class CounterOfCitizens implements CitizenCounter {
    protected List<CitizenCounter> counterList = new ArrayList<>();

    @Override
    public int countCitizens() {
        int count = 0;
        for (CitizenCounter counter:
                counterList) {
            count += counter.countCitizens();
        }

        return count;
    }
}
