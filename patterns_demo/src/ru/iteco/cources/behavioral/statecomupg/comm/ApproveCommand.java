package ru.iteco.cources.behavioral.statecomupg.comm;

import ru.iteco.cources.behavioral.statecomupg.Document;

public class ApproveCommand extends DocumentCommand {
    public ApproveCommand(Document documentAsRunner) {
        super(documentAsRunner);
    }

    @Override
    public void execute() {
        if(documentAsRunner.getState().onApprove()) {
            System.out.println("Approved!");
        }
    }
}
