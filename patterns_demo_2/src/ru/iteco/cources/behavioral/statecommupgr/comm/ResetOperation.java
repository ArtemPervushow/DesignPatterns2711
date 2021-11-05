package ru.iteco.cources.behavioral.statecommupgr.comm;

import ru.iteco.cources.behavioral.statecommupgr.Document;

public class ResetOperation extends DocumentOperation {
    private final DocState docState;

    public ResetOperation(Document document, DocState docState) {
        super(document);
        this.docState = docState;
    }

    @Override
    public boolean execute() {
        System.out.println("Reset to " + docState);
        document.setDocumentState(DocStateFactory.setState(docState, document));
        return true;
    }

    @Override
    public boolean isValid() {
        return true;
    }
}
