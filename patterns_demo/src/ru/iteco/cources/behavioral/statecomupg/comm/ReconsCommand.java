package ru.iteco.cources.behavioral.statecomupg.comm;

import ru.iteco.cources.behavioral.statecomupg.Document;

public class ReconsCommand extends DocumentCommand {
    public ReconsCommand(Document documentAsRunner) {
        super(documentAsRunner);
    }

    @Override
    public void execute() {
        if(documentAsRunner.getState().onRecons()) {
            System.out.println("Reconsilation");
        }
    }
}
