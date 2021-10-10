package ru.iteco.cources.behavioral.statecommupgr.comm;

import ru.iteco.cources.behavioral.statecommupgr.Document;

public class ReconsilationOperation extends DocumentOperation {
    public ReconsilationOperation(Document document) {
        super(document);
    }

    @Override
    public boolean execute() {
        System.out.println("Recons!");
        return true;
    }

    @Override
    public boolean isValid() {
        return document.getDocumentState().onReconsilation();
    }
}
