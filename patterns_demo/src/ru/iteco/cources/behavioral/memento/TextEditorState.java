package ru.iteco.cources.behavioral.memento;

public class TextEditorState {
    private String text;

    public TextEditorState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
