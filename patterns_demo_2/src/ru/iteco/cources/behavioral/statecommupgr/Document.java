package ru.iteco.cources.behavioral.statecommupgr;

import ru.iteco.cources.behavioral.statecommupgr.comm.DocumentOperation;

public class Document {
    private DocumentState documentState;

    public Document() {
        documentState = new NewState(this);
    }

    public DocumentState getDocumentState() {
        return documentState;
    }

    public void setDocumentState(DocumentState documentState) {
        this.documentState = documentState;
    }

    public boolean executeDocumentOperation(DocumentOperation operation) {
        if(operation.isValid()) {
            return operation.execute();
        } else {
            System.out.println("Wrong state");
            return false;
        }
    }
}
