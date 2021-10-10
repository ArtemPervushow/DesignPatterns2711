package ru.iteco.cources.behavioral.statecomupg;

import ru.iteco.cources.behavioral.statecomupg.comm.DocumentCommand;

public class Document {
    private DocumentState state;

    public Document() {
    }

    public DocumentState getState() {
        return state;
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void executeCommand(DocumentCommand command) {
        command.execute();
    }
}
