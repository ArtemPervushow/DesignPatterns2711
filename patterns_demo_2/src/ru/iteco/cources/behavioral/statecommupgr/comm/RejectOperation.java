package ru.iteco.cources.behavioral.statecommupgr.comm;

import ru.iteco.cources.behavioral.statecommupgr.Document;

public class RejectOperation extends DocumentOperation {
    public RejectOperation(Document document) {
        super(document);
    }

    @Override
    public boolean execute() {
        System.out.println("Rejected!");
        return true;
    }

    @Override
    public boolean isValid() {
        return document.getDocumentState().onReject();
    }
}
