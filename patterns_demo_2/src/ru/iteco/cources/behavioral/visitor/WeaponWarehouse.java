package ru.iteco.cources.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class WeaponWarehouse extends Organization {
    private List<String> weaponList = new ArrayList<>();

    public WeaponWarehouse(String directorName, List<String> employees, float balance) {
        super(directorName, employees, balance);
    }

    public List<String> getWeaponList() {
        return weaponList;
    }
}
