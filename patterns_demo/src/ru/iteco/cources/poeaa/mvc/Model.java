package ru.iteco.cources.poeaa.mvc;

public class Model {
    private String currentText = "";

    public void appendText(String text) {
        StringBuilder sb = new StringBuilder(currentText);
        sb.append(text);

        currentText = sb.toString();
    }

    public void removeLastSymbol() {
        currentText = currentText.substring(0, currentText.length()-1);
    }

    public String getText() {
        return currentText;
    }
}
