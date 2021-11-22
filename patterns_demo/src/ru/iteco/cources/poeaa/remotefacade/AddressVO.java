package ru.iteco.cources.poeaa.remotefacade;

import java.util.ArrayList;
import java.util.List;

public class AddressVO {
    private long id;
    private String city;
    private String street;
    private short houseNumber;
    private Human owner;
    private List<Human> humanList;

    public AddressVO(long id, String city, String street, short houseNumber, Human owner, List<Human> humanList) throws CloneNotSupportedException {
        this.id = id;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.owner = (Human) owner.clone();
        this.humanList = new ArrayList<>();
        for (Human human:
             humanList) {
            this.humanList.add((Human) human.clone());
        }
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

    public short getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(short houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) throws CloneNotSupportedException {
        this.owner = (Human) owner.clone();
    }

    public List<Human> getHumanList() {
        return humanList;
    }

    public void setHumanList(List<Human> humanList) throws CloneNotSupportedException {
        this.humanList = new ArrayList<>();
        for (Human human:
                humanList) {
            this.humanList.add((Human) human.clone());
        }
    }
}
