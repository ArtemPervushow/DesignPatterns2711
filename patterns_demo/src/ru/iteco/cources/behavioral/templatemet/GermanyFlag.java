package ru.iteco.cources.behavioral.templatemet;

import ru.iteco.cources.structural.flyweight.Color;

public class GermanyFlag extends Flag {
    @Override
    public void draw() {
        drawFlagpole();
        Colors.paintBlackColor();
        Colors.paintYellowColor();
        Colors.paintRedColor();
    }
}
