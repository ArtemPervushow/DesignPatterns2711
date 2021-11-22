package ru.iteco.cources.behavioral.memento;

public class TextEditorState {
    private String text;
    private int cursorPosition;

    public TextEditorState(String text, int cursorPosition) {
        this.text = text;
        this.cursorPosition = cursorPosition;
    }

    public String getText() {
        return text;
    }

    public int getCursorPosition() {
        return cursorPosition;
    }

}
