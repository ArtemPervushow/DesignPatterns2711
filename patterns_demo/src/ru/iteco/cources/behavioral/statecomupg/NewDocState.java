package ru.iteco.cources.behavioral.statecomupg;

public class NewDocState extends DocumentState {
    public NewDocState(Document document) {
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
        return false;
    }

    @Override
    public boolean onRecons() {
        document.setState(new ReconsDocState(document));
        return true;
    }
}
