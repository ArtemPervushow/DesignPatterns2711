package ru.iteco.cources.behavioral.memento;

import java.util.LinkedList;
import java.util.List;

public class TextEditorController {
    private TextEditor editor;
    private List<TextEditorState> history;

    public TextEditorController(TextEditor editor) {
        this.editor = editor;
        history = new LinkedList<>();
    }

    public void hitText(String text) {
        editor.addText(text);
    }

    public void hitSave() {
        history.add(editor.save());
    }

    public void hitUndo() {
        editor.restore(history.get(history.size()-1));
        history.remove(history.size() -1);
    }
}
