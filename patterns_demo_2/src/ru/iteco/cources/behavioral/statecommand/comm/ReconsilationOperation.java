package ru.iteco.cources.behavioral.statecommand.comm;

public class ReconsilationOperation extends DocumentOperation {
    @Override
    public boolean execute() {
        if(document.getDocumentState().onReconsilation()) {
            System.out.println("Recons!");
            return true;
        }

        return false;
    }
}
