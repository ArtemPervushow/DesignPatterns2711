package ru.iteco.cources.behavioral.memento;

public class TextEditor {
    private StringBuilder currentText;

    public TextEditor() {
        currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public TextEditorState save() {
        return new TextEditorState(currentText.toString());
    }

    public void restore(TextEditorState textEditorState) {
        currentText = new StringBuilder(textEditorState.getText());
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "currentText=" + currentText +
                '}';
    }
}
