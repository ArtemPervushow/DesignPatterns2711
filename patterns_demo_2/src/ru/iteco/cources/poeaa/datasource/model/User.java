package ru.iteco.cources.poeaa.datasource.model;

import java.util.UUID;

public class User {
    private UUID uuid;
    private String name;
    private boolean sex;
    private short age;
    private Pasport pasport;

    public Pasport getPasport() {
        return pasport;
    }

    public void setPasport(Pasport pasport) {
        this.pasport = pasport;
    }

    public User(UUID uuid, String name, boolean sex, short age) {
        this.uuid = uuid;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
