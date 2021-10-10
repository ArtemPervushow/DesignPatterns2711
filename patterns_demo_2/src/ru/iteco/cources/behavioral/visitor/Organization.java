package ru.iteco.cources.behavioral.visitor;

import java.util.List;

public class Organization {
    private String directorName;
    private List<String> employees;
    private float balance;

    public Organization(String directorName, List<String> employees, float balance) {
        this.directorName = directorName;
        this.employees = employees;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "directorName='" + directorName + '\'' +
                ", employees=" + employees +
                ", balance=" + balance +
                '}';
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
