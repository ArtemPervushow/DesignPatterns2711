package ru.iteco.cources.behavioral.statecommupgr;

public class ReconsilationState extends DocumentState {
    public ReconsilationState(Document document) {
        super(document);
    }

    @Override
    public boolean onNew() {
        System.out.println("We are on reconsiltation!");
        return false;
    }

    @Override
    public boolean onReconsilation() {
        System.out.println("We are already on reconsiltation!");
        return false;
    }

    @Override
    public boolean onApprove() {
        System.out.println("Going to approve!");
        document.setDocumentState(new ApproveState(document));
        return true;
    }

    @Override
    public boolean onReject() {
        System.out.println("Going to reject");
        document.setDocumentState(new RejectState(document));
        return true;
    }

    @Override
    public boolean onDelete() {
        System.out.println("Going to delete");
        document.setDocumentState(new DeleteState(document));
        return true;
    }
}
