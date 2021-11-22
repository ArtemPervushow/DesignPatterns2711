package ru.iteco.cources.poeaa.remotefacade;

import java.util.ArrayList;

public class AddressVO {
    private long id;
    private String city;
    private String street;
    private String postCode;
    private int number;
    private Human owner;
    private ArrayList<Human> neighbours;

    public AddressVO(long id, String city, String street, String postCode, int number, Human owner) throws CloneNotSupportedException {
        this.id = id;
        this.city = city;
        this.street = street;
        this.postCode = postCode;
        this.number = number;
        this.owner = (Human) owner.clone();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) throws CloneNotSupportedException {
        this.owner = (Human) owner.clone();
    }
}
