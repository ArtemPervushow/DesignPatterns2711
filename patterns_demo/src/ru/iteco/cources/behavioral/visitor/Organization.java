package ru.iteco.cources.behavioral.visitor;

import java.util.List;

public class Organization {
    private List<String> employees;
    private String director;
    private float balance;
    private float licenseNum;

    @Override
    public String toString() {
        return "Organization{" +
                "employees=" + employees +
                ", director='" + director + '\'' +
                ", balance=" + balance +
                ", licenseNum=" + licenseNum +
                '}';
    }

    public Organization(List<String> employees, String director, float balance, float licenseNum) {
        this.employees = employees;
        this.director = director;
        this.balance = balance;
        this.licenseNum = licenseNum;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(float licenseNum) {
        this.licenseNum = licenseNum;
    }
}
