package ru.iteco.cources.behavioral.statecomupg;

public abstract class DocumentState {
    Document document;

    public DocumentState(Document document) {
        this.document = document;
    }

    public abstract boolean onNew();
    public abstract boolean onDelete();
    public abstract boolean onApprove();
    public abstract boolean onRecons();
}
