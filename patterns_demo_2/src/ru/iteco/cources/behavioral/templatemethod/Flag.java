package ru.iteco.cources.behavioral.templatemethod;

public abstract class Flag {
    protected void drawFlagPole(){
        System.out.println("Рисуем флагшток");
    }

    public abstract void draw();
}
