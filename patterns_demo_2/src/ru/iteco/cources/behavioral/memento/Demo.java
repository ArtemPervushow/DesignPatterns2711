package ru.iteco.cources.behavioral.memento;

public class Demo {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorCaretaker textEditorCaretaker = new TextEditorCaretaker(textEditor);
        textEditorCaretaker.hitText("one");
        textEditorCaretaker.hitSave();
        textEditorCaretaker.hitText("two");
        textEditorCaretaker.hitSave();
        textEditorCaretaker.hitText("three");
        textEditorCaretaker.hitSave();
        textEditorCaretaker.hitText(3, " .5");
        textEditorCaretaker.hitSave();
        System.out.println(textEditor.getWholeText()); // one .5 two three
        textEditorCaretaker.undo();
        System.out.println(textEditor.getWholeText()); // one .5 two three

        textEditorCaretaker.undo();
        System.out.println(textEditor.getWholeText()); // one two three

        textEditorCaretaker.redo();
        System.out.println(textEditor.getWholeText()); // one .5 two three

        textEditorCaretaker.redo();
        System.out.println(textEditor.getWholeText()); // one .5 two three

        textEditorCaretaker.undo();
        System.out.println(textEditor.getWholeText()); // one .5 two three

        textEditorCaretaker.undo();
        System.out.println(textEditor.getWholeText()); // one two three

        textEditorCaretaker.undo();
        System.out.println(textEditor.getWholeText()); // one two

        textEditorCaretaker.redo();
        System.out.println(textEditor.getWholeText()); // one two three

        textEditorCaretaker.hitText("four");
        System.out.println(textEditor.getWholeText());

        textEditorCaretaker.hitText("five");
        System.out.println(textEditor.getWholeText());

//        textEditorCaretaker.undo();
//        System.out.println(textEditor.getWholeText());

        textEditorCaretaker.redo();
        System.out.println(textEditor.getWholeText()); // one two three

        textEditorCaretaker.redo();
        System.out.println(textEditor.getWholeText()); // one two three


    }
}
