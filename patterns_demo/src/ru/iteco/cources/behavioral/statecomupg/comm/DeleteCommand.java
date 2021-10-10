package ru.iteco.cources.behavioral.statecomupg.comm;

import ru.iteco.cources.behavioral.statecomupg.Document;

public class DeleteCommand extends DocumentCommand {
    public DeleteCommand(Document documentAsRunner) {
        super(documentAsRunner);
    }

    @Override
    public void execute() {
        if(documentAsRunner.getState().onDelete()) {
            System.out.println("Goes to delete");
        }
    }
}
