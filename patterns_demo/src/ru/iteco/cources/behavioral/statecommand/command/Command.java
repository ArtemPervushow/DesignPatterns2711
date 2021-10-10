package ru.iteco.cources.behavioral.statecommand.command;

import ru.iteco.cources.behavioral.statecommand.state.Document;
import ru.iteco.cources.behavioral.statecommand.state.DocumentState;

public abstract class Command {
    Document document;
    DocumentState previousState;

    public Command(Document document) {
        this.document = document;
    }

    public abstract Document execute();

    public void backup() {
        previousState = document.getState();
    }

    public void undo() {
        document.setState(previousState);
    }
}
