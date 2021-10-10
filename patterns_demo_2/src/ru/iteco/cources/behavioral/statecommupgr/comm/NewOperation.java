package ru.iteco.cources.behavioral.statecommupgr.comm;

import ru.iteco.cources.behavioral.statecommupgr.Document;

public class NewOperation extends DocumentOperation {
    public NewOperation(Document document) {
        super(document);
    }

    @Override
    public boolean execute() {
        System.out.println("Created!");
        return true;
    }

    @Override
    public boolean isValid() {
        return document.getDocumentState().onNew();
    }
}
