package ru.iteco.cources.behavioral.statecommand.state;

import ru.iteco.cources.behavioral.statecommand.command.Command;

public abstract class DocumentState {
    Document document;
    Command command;

    public DocumentState(Document document, Command command) {
        this.document = document;
        this.command = command;
    }

    public abstract Document onNew();
    public abstract Document onRecons();
    public abstract Document onReject();
    public abstract Document onDelete();
}
