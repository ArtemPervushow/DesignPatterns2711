package ru.iteco.cources.behavioral.statecommand.command;

import ru.iteco.cources.behavioral.statecommand.state.Document;

public class DeleteCommand extends Command {
    public DeleteCommand(Document document) {
        super(document);
    }

    @Override
    public Document execute() {
        return document.getState().onDelete();
    }
}
