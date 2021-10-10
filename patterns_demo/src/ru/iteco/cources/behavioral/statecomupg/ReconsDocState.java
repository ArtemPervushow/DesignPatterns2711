package ru.iteco.cources.behavioral.statecomupg;

public class ReconsDocState extends DocumentState {
    public ReconsDocState(Document document) {
        super(document);
    }

    @Override
    public boolean onNew() {
        return false;
    }

    @Override
    public boolean onDelete() {
        document.setState(new DeleteDocState(document));
        return true;
    }

    @Override
    public boolean onApprove() {
        document.setState(new ApproveDocState(document));
        return true;
    }

    @Override
    public boolean onRecons() {
        return false;
    }
}
