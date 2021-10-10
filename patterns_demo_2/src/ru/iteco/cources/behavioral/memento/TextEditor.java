package ru.iteco.cources.behavioral.memento;

public class TextEditor {
    private StringBuilder wholeText;

    public TextEditor() {
        wholeText = new StringBuilder();
    }

    public void appendText(String text) {
        wholeText.append(text);
    }

    public void removeText(int times) {
        for (int i = 0; i < times; i++) {
            wholeText.deleteCharAt(wholeText.length()-1);
        }
    }

    public void setWholeText(StringBuilder wholeText) {
        this.wholeText = wholeText;
    }

    public StringBuilder getWholeText() {
        return wholeText;
    }
}
