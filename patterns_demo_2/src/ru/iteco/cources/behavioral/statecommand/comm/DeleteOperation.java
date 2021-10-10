package ru.iteco.cources.behavioral.statecommand.comm;

public class DeleteOperation extends DocumentOperation {
    @Override
    public boolean execute() {
        if(document.getDocumentState().onDelete()) {
            System.out.println("Deleted");
            return true;
        }

        return false;
    }
}
