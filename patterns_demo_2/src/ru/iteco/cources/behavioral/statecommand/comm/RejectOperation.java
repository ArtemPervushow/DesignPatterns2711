package ru.iteco.cources.behavioral.statecommand.comm;

public class RejectOperation extends DocumentOperation {
    @Override
    public boolean execute() {
        if(document.getDocumentState().onReject()) {
            System.out.println("Rejected!");
            return true;
        }

        return false;
    }
}
