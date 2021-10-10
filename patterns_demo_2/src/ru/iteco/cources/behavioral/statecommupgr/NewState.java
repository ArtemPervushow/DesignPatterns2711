package ru.iteco.cources.behavioral.statecommupgr;

public class NewState extends DocumentState {
    public NewState(Document document) {
        super(document);
    }

    @Override
    public boolean onNew() {
        System.out.println("We are already in new!");
        return false;
    }

    @Override
    public boolean onReconsilation() {
        System.out.println("Going to reconsilation");
        document.setDocumentState(new ReconsilationState(document));
        return true;
    }

    @Override
    public boolean onApprove() {
        System.out.println("First, go to reconsiltaion");
        return false;
    }

    @Override
    public boolean onReject() {
        System.out.println("First, go to reconsiltaion");
        return false;
    }

    @Override
    public boolean onDelete() {
        System.out.println("Going to delete");
        document.setDocumentState(new DeleteState(document));
        return true;
    }
}
