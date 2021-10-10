package ru.iteco.cources.behavioral.memento;

public class Demo {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorController controller = new TextEditorController(textEditor);

        controller.hitText("87397323");
        controller.hitSave();
        controller.hitText("dsdsa");
        controller.hitText("cxzc");
        controller.hitSave();
        controller.hitText("qwew");

        System.out.println(textEditor);
        controller.hitUndo();
        System.out.println(textEditor);
        controller.hitUndo();
        System.out.println(textEditor);
    }
}
