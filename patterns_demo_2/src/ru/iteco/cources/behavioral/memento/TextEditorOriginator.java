package ru.iteco.cources.behavioral.memento;

public class TextEditorOriginator {
    private TextEditor textEditor;

    public TextEditorOriginator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(textEditor.getWholeText().toString());
    }

    public void restore(TextEditorMemento memento) {
        textEditor.setWholeText(new StringBuilder(memento.getCurrentText()));
    }
}
