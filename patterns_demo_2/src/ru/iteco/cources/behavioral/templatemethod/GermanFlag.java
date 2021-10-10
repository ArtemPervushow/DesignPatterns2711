package ru.iteco.cources.behavioral.templatemethod;

public class GermanFlag extends Flag {
    @Override
    public void draw() {
        drawFlagPole();
        ColorsDraw.drawBlack();
        ColorsDraw.drawRed();
        ColorsDraw.drawYellow();
    }
}
