package ru.iteco.cources.behavioral.statecommand.comm;

public class ApproveOperation extends DocumentOperation {
    @Override
    public boolean execute() {
        if(document.getDocumentState().onApprove()) {
            System.out.println("Approved!");
            return true;
        }

        return false;
    }
}
