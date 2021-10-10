package ru.iteco.cources.behavioral.statecommand.state;

import ru.iteco.cources.behavioral.statecommand.command.Command;

public class DeletedState extends DocumentState {
    public DeletedState(Document document, Command command) {
        super(document, command);
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
