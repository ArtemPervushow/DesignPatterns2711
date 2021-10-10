package ru.iteco.cources.behavioral.statecommandbad;

public class DeletedState extends DocumentState {
    public DeletedState(Document document, Command command, CommandRunner commandRunner) {
        super(document, command, commandRunner);
    }

    @Override
    public Document onNew() {
        System.out.println("Deleted!");
        return document;
    }

    @Override
    public Document onRecons() {
        System.out.println("Deleted!");
        return document;
    }

    @Override
    public Document onReject() {
        System.out.println("Deleted!");
        return document;
    }

    @Override
    public Document onDelete() {
        System.out.println("Deleted!");
        return document;
    }
}
