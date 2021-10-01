package ru.iteco.cources.behavioral.mediator;

public class Furniture {
    private String name;
    private int count;
    private boolean wormSave;

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", wormSave=" + wormSave +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isWormSave() {
        return wormSave;
    }

    public void setWormSave(boolean wormSave) {
        this.wormSave = wormSave;
    }
}
