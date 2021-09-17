package ru.iteco.cources.creational.prototype;

public class Author implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author(String name) {
        this.name = name;
    }

    @Override
    protected Author clone() throws CloneNotSupportedException {
        return (Author) super.clone();
    }
}
