package ru.iteco.cources.behavioral.statecommand;

import ru.iteco.cources.behavioral.statecommand.comm.*;

public class Document {
    private DocumentState documentState;

    public Document() {
    }

    public DocumentState getDocumentState() {
        return documentState;
    }

    public void setDocumentState(DocumentState documentState) {
        this.documentState = documentState;
    }

    public boolean executeDocumentOperation(DocumentOperation operation) {
        /*boolean canDoOperation = false;
        if(operation instanceof NewOperation) {
            canDoOperation = getDocumentState().onNew();
        } else if (operation instanceof ReconsilationOperation) {
            canDoOperation = getDocumentState().onReconsilation();
        } else if (operation instanceof RejectOperation) {
            canDoOperation = getDocumentState().onReject();
        } else if (operation instanceof ApproveOperation) {
            canDoOperation = getDocumentState().onApprove();
        } else if (operation instanceof DeleteOperation) {
            canDoOperation = getDocumentState().onDelete();
        }

        if(canDoOperation)
            return operation.execute();
        else
            return false;*/
        if(operation.execute()){
            System.out.println("Success!");
            return true;
        } else {
            System.out.println("Wrong state!");
            return false;
        }
    }
}
