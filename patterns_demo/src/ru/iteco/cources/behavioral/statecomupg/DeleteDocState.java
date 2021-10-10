package ru.iteco.cources.behavioral.statecomupg;

public class DeleteDocState extends DocumentState {
    public DeleteDocState(Document document) {
        super(document);
    }

    @Override
    public boolean onNew() {
        return false;
    }

    @Override
    public boolean onDelete() {
        return false;
    }

    @Override
    public boolean onApprove() {
        return false;
    }

    @Override
    public boolean onRecons() {
        return false;
    }
}
