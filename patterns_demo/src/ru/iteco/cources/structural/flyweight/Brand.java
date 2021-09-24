package ru.iteco.cources.structural.flyweight;

public class Brand {
    private String name;
    private String country;
    private String company;

    public Brand(String name, String country, String company) {
        this.name = name;
        this.country = country;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
