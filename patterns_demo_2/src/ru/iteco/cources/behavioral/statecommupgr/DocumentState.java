package ru.iteco.cources.behavioral.statecommupgr;

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

    @Override
    public String toString() {
        if (this instanceof NewState)
            return "Document state: NewState";
        if (this instanceof ReconsilationState)
            return "Document state: ReconsilationState";
        if (this instanceof RejectState)
            return "Document state: RejectState";
        if (this instanceof ApproveState)
            return "Document state: ApproveState";
        if (this instanceof DeleteState)
            return "Document state: DeleteState";

        return "Document state:";
    }
}
