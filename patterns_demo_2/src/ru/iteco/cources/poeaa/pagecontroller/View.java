package ru.iteco.cources.poeaa.pagecontroller;

public class View {
    private String data;
    private String color;

    public View(String color) {
        this.color = color;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void display() {
        System.out.println(data + " with color " + color);
    }
}
