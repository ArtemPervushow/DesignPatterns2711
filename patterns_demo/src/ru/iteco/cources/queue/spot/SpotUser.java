package ru.iteco.cources.queue.spot;

import java.util.Objects;

public class SpotUser {
    private long id;
    private String name;
    private boolean sex;
    private short age;

    public SpotUser(long id, String name, boolean sex, short age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "SpotUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpotUser spotUser = (SpotUser) o;
        return id == spotUser.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
