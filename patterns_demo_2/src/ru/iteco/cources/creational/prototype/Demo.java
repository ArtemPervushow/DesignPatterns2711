package ru.iteco.cources.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(100);
        circle.setColor("green");
        circle.setCoordX(10);
        circle.setCoordY(5);

        Author author = new Author("Artem");
        circle.setAuthor(author);

        try {
            Circle circle2 = circle.clone();
            System.out.println(circle2.toString());
            circle.setRadius(200);
            System.out.println(circle2.toString());

            circle.getAuthor().setName("Kate");
            System.out.println(circle2.getAuthor().getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
