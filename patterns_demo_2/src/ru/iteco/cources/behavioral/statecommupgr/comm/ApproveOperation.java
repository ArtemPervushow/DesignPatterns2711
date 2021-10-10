package ru.iteco.cources.behavioral.statecommupgr.comm;

import ru.iteco.cources.behavioral.statecommupgr.Document;

public class ApproveOperation extends DocumentOperation {
    public ApproveOperation(Document document) {
        super(document);
    }

    @Override
    public boolean execute() {
        System.out.println("Approved!");
        return true;
    }

    @Override
    public boolean isValid() {
        return document.getDocumentState().onApprove();
    }
}
