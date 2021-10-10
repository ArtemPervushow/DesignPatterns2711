package ru.iteco.cources.behavioral.templatemethod;

public class RussianFlag extends Flag {
    @Override
    public void draw() {
        drawFlagPole();
        ColorsDraw.drawWhite();
        ColorsDraw.drawBlue();
        ColorsDraw.drawRed();
    }
}
