package ru.iteco.cources.poeaa.remotefacade;

import java.util.List;

public class Address {
    private long id;
    private String city;
    private String street;
    private short houseNumber;
    private Human owner;
    private List<Human> humanList;

    public Address(String city, String street, short houseNumber, Human owner, List<Human> humanList) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.owner = owner;
        this.humanList = humanList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public List<Human> getHumanList() {
        return humanList;
    }

    public void setHumanList(List<Human> humanList) {
        this.humanList = humanList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public short getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(short houseNumber) {
        this.houseNumber = houseNumber;
    }
}
