package ru.iteco.cources.behavioral.memento;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class TextEditorController {
    private TextEditor editor;
    private List<TextEditorState> history;
    private int currentState = -1;

    public TextEditorController(TextEditor editor) {
        this.editor = editor;
        history = new LinkedList<>();
    }

    public void hitText(String text) {
        editor.addText(text);
    }

    public void hitSave() {
        Stream.iterate(history.size() - 1, n -> n--)
                .limit(history.size() - currentState).forEach(n -> history.remove((int) n));
        history.add(editor.save());
        currentState++;
    }

    public void hitUndo() {
        editor.restore(history.get(currentState));
        currentState--;
    }

    public void hitRedo() {
        currentState++;
        editor.restore(history.get(currentState));
    }

}
