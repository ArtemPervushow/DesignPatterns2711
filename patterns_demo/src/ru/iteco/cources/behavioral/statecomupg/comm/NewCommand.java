package ru.iteco.cources.behavioral.statecomupg.comm;

import ru.iteco.cources.behavioral.statecomupg.Document;

public class NewCommand extends DocumentCommand {
    public NewCommand(Document documentAsRunner) {
        super(documentAsRunner);
    }

    @Override
    public void execute() {
        if(documentAsRunner.getState().onNew()){
            System.out.println("New doc!");
        }
    }
}
