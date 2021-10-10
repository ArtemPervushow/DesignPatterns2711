package ru.iteco.cources.behavioral.statecommupgr.comm;


import ru.iteco.cources.behavioral.statecommupgr.Document;

public abstract class DocumentOperation {
    Document document; //AS Command Runner

    public DocumentOperation(Document document) {
        this.document = document;
    }

    public abstract boolean execute();
    public abstract boolean isValid();
}
