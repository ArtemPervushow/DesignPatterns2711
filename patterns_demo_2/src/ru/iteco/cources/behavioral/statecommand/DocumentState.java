package ru.iteco.cources.behavioral.statecommand;

public abstract class DocumentState {
    Document document;

    public DocumentState(Document document) {
        this.document = document;
    }

    public abstract boolean onNew();
    public abstract boolean onReconsilation();
    public abstract boolean onApprove();
    public abstract boolean onReject();
    public abstract boolean onDelete();
}
