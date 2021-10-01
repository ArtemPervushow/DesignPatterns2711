package ru.iteco.cources.behavioral.mediator;

public class Rama {
    private String name;
    private float widht;
    private float height;
    private int countOfFurniture;

    private ProductionWndMediator window;

    public Rama(Window window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "Rama{" +
                "name='" + name + '\'' +
                ", widht=" + widht +
                ", height=" + height +
                ", countOfFurniture=" + countOfFurniture +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWidht() {
        return widht;
    }

    public void setWidht(float widht) {
        window.setWidht(widht);
        this.widht = widht;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        window.setHeight(height);
        this.height = height;
    }

    public int getCountOfFurniture() {
        return countOfFurniture;
    }

    public void setCountOfFurniture(int countOfFurniture) {
        window.setCountFurniture(countOfFurniture);
        this.countOfFurniture = countOfFurniture;
    }
}
