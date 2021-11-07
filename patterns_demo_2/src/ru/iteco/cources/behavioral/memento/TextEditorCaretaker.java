package ru.iteco.cources.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextEditorCaretaker {
    private TextEditorOriginator originator;
    private TextEditor textEditor;
    private List<TextEditorMemento> history = new ArrayList<>();
    private int histPosition;
    private boolean isUndo;

    public TextEditorCaretaker(TextEditor textEditor) {
        this.originator = new TextEditorOriginator(textEditor);
        this.textEditor = textEditor;
    }

    public void hitText(String text) {
        textEditor.appendText(text);
        isUndo = false;
        if (histPosition != history.size() - 1) {
            history = history.stream().limit(histPosition + 1).collect(Collectors.toList());
        }
    }

    public void hitText(int position, String text) {
        textEditor.appendText(position, text);
        isUndo = false;
    }

    public void hitRemove() {
        textEditor.removeText(1);
        isUndo = false;
    }

    public void hitRemove(int position) {
        textEditor.removeText(position, 1);
        isUndo = false;
    }

    public void hitSave() {
        history.add(originator.save());
        histPosition = history.size() - 1;
        isUndo = false;
    }

    public void undo() {
        originator.restore(history.get(histPosition));
        if (history.size() - 1 > 0)
            histPosition--;
        isUndo = true;
    }

    public void redo() {
        if (isUndo) {
            if (histPosition + 2 == history.size()) histPosition++;
            else histPosition = histPosition + 2;
            isUndo = false;
            originator.restore(history.get(histPosition));
            return;
        }
        if (history.size() - 1 > histPosition)
            histPosition++;
        originator.restore(history.get(histPosition));
    }
}
