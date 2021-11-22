package ru.iteco.cources.poeaa.locks.coarcegrained.optimistic;

public class Address {
    private long id;
    private String value;

    public Address(long id, String value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
