package ru.iteco.cources.behavioral.statecomupg.comm;

import ru.iteco.cources.behavioral.statecomupg.Document;

public abstract class DocumentCommand {
    Document documentAsRunner;

    public DocumentCommand(Document documentAsRunner) {
        this.documentAsRunner = documentAsRunner;
    }

    public abstract void execute();
}
