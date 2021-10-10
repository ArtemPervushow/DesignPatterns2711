package ru.iteco.cources.behavioral.templatemet;

public class RussianFlag extends Flag {
    @Override
    public void draw() {
        drawFlagpole();
        Colors.paintWhiteColor();
        Colors.paintBlueColor();
        Colors.paintRedColor();
    }
}
