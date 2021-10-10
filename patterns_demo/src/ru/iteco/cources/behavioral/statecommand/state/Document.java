package ru.iteco.cources.behavioral.statecommand.state;

import ru.iteco.cources.behavioral.statecommand.command.Command;
import ru.iteco.cources.behavioral.statecommand.command.NewCommand;

public class Document {
    private DocumentState state;

    public Document() {
        this.state = new NewDocumentState(this, new NewCommand(this));
    }

    public DocumentState getState() {
        return state;
    }

    public Document setState(DocumentState state) {
        this.state = state;
        return this;
    }

    public Document runCommand(Command command) {
        command.backup();
        Document result = command.execute();

        return result;
    }
}
