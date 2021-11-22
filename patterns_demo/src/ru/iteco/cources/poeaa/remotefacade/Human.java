package ru.iteco.cources.poeaa.remotefacade;

import java.util.List;

public class Human implements Cloneable{
    private String fio;
    private short age;
    private boolean sex;
    private String profession;
    private List<Human> parents;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Human(String fio, short age, boolean sex, String profession, List<Human> parents) {
        this.fio = fio;
        this.age = age;
        this.sex = sex;
        this.profession = profession;
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "Human{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", profession='" + profession + '\'' +
                ", parents=" + parents +
                '}';
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public List<Human> getParents() {
        return parents;
    }

    public void setParents(List<Human> parents) {
        this.parents = parents;
    }
}
