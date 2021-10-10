package ru.iteco.cources.behavioral.statecommupgr;

public class RejectState extends DocumentState {
    public RejectState(Document document) {
        super(document);
    }

    @Override
    public boolean onNew() {
        System.out.println("We are on reject!");
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
        System.out.println("We are on reject");
        return false;
    }

    @Override
    public boolean onReject() {
        System.out.println("We are already on reject");
        return false;
    }

    @Override
    public boolean onDelete() {
        System.out.println("Going to delete");
        document.setDocumentState(new DeleteState(document));
        return true;
    }
}
