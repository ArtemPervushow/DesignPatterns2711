package ru.iteco.cources.behavioral.statecommupgr.comm;

import ru.iteco.cources.behavioral.statecommupgr.Document;

public class DeleteOperation extends DocumentOperation {
    public DeleteOperation(Document document) {
        super(document);
    }

    @Override
    public boolean execute() {
        System.out.println("Deleted");
        return true;
    }

    @Override
    public boolean isValid() {
        return document.getDocumentState().onDelete();
    }
}
