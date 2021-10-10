package ru.iteco.cources.behavioral.statecommand.state;

import ru.iteco.cources.behavioral.statecommand.command.Command;
import ru.iteco.cources.behavioral.statecommand.command.DeleteCommand;
import ru.iteco.cources.behavioral.statecommand.command.RejectCommand;

public class ReconsilationState extends DocumentState {
    public ReconsilationState(Document document, Command command) {
        super(document, command);
    }

    @Override
    public Document onNew() {
        System.out.println("We are on reconsilation!");
        return document;
    }

    @Override
    public Document onRecons() {
        System.out.println("We are already on reconsilation!");
        return document;
    }

    @Override
    public Document onReject() {
        System.out.println("Rejecting!");
        return document.runCommand(new RejectCommand(document));
    }

    @Override
    public Document onDelete() {
        System.out.println("Deleting!");
        return document.runCommand(new DeleteCommand(document));
    }
}
