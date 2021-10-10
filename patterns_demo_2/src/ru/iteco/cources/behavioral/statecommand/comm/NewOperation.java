package ru.iteco.cources.behavioral.statecommand.comm;

public class NewOperation extends DocumentOperation {
    @Override
    public boolean execute() {
        if(document.getDocumentState().onNew()) {
            System.out.println("Created!");
            return true;
        }

        return false;
    }
}
