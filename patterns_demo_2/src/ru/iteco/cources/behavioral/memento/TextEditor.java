package ru.iteco.cources.behavioral.memento;

public class TextEditor {
    private StringBuilder wholeText;

    public TextEditor() {
        wholeText = new StringBuilder();
    }

    public void appendText(String text) {
        wholeText.append(text).append(" ");
    }

    public void appendText(int position, String text) {
        wholeText.insert(position, text);
    }

    public void removeText(int times) {
        for (int i = 0; i < times; i++) {
            wholeText.deleteCharAt(wholeText.length() - 1);
        }
    }

    public void removeText(int position, int times) {
        for (int i = 0; i < times; i++) {
            if (position >= i)
                wholeText.deleteCharAt(position - i);
        }
    }

    public void setWholeText(StringBuilder wholeText) {
        this.wholeText = wholeText;
    }

    public StringBuilder getWholeText() {
        return wholeText;
    }


}
