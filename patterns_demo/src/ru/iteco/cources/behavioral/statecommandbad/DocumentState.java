package ru.iteco.cources.behavioral.statecommandbad;

public abstract class DocumentState {
    Document document;
    Command command;
    CommandRunner commandRunner;

    public DocumentState(Document document, Command command, CommandRunner commandRunner) {
        this.document = document;
        this.command = command;
        this.commandRunner = commandRunner;
    }

    public abstract Document onNew();
    public abstract Document onRecons();
    public abstract Document onReject();
    public abstract Document onDelete();
}
