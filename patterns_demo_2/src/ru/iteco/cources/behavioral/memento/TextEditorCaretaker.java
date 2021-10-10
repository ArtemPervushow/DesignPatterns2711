package ru.iteco.cources.behavioral.memento;

import java.util.LinkedList;
import java.util.List;

public class TextEditorCaretaker {
    private TextEditorOriginator originator;
    private TextEditor textEditor;
    private LinkedList<TextEditorMemento> history = new LinkedList<>();

    public TextEditorCaretaker(TextEditor textEditor) {
        this.originator = new TextEditorOriginator(textEditor);
        this.textEditor = textEditor;
    }

    public void hitText(String text) {
        textEditor.appendText(text);
    }

    public void hitRemove(){
        textEditor.removeText(1);
    }

    public void hitSave() {
        history.add(originator.save());
    }

    public void undo(){
        originator.restore(history.getLast());
        history.removeLast();
    }
}
