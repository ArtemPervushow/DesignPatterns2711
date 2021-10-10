package ru.iteco.cources.behavioral.statecommand.command;

import ru.iteco.cources.behavioral.statecommand.state.Document;

public class ReconsilationCommand extends Command {
    public ReconsilationCommand(Document document) {
        super(document);
    }

    @Override
    public Document execute() {
        return document.getState().onRecons();
    }
}
