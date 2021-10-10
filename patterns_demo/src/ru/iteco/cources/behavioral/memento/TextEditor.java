package ru.iteco.cources.behavioral.memento;

public class TextEditor {
    private StringBuilder currentText;
    private int cursorPosition = 0;

    public TextEditor() {
        currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.insert(cursorPosition, text);
        cursorPosition += text.length();
    }

    public TextEditorState save() {
        return new TextEditorState(currentText.toString(), cursorPosition);
    }

    public void restore(TextEditorState textEditorState) {
        currentText = new StringBuilder(textEditorState.getText());
        cursorPosition = textEditorState.getCursorPosition();
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "currentText=" + currentText +
                '}';
    }
}
