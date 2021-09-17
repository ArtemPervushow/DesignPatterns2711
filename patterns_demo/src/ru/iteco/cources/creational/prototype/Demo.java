package ru.iteco.cources.creational.prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle();
        circle1.coordX = 10;
        circle1.author = new Author("Artem");

        Circle circle2 = circle1.clone();
    }
}
