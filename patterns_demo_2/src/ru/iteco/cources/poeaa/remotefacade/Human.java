package ru.iteco.cources.poeaa.remotefacade;

import java.util.ArrayList;

public class Human implements Cloneable{
    private String fio;
    private boolean sex;
    private short age;
    private ArrayList<Human> parents;

    public Human(String fio, boolean sex, short age) {
        this.fio = fio;
        this.sex = sex;
        this.age = age;
        this.parents = new ArrayList<>();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public ArrayList<Human> getParents() {
        return parents;
    }

    public void setParents(ArrayList<Human> parents) {
        this.parents = parents;
    }
}
