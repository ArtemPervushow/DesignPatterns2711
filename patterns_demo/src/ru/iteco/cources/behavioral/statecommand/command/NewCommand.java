package ru.iteco.cources.behavioral.statecommand.command;

import ru.iteco.cources.behavioral.statecommand.state.Document;

public class NewCommand extends Command {
    public NewCommand(Document document) {
        super(document);
    }

    @Override
    public Document execute() {
        return document.getState().onNew();
    }
}
