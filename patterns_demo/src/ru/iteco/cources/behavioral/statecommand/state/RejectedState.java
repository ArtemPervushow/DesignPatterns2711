package ru.iteco.cources.behavioral.statecommand.state;

import ru.iteco.cources.behavioral.statecommand.command.Command;
import ru.iteco.cources.behavioral.statecommand.command.DeleteCommand;
import ru.iteco.cources.behavioral.statecommand.command.ReconsilationCommand;

public class RejectedState extends DocumentState {
    public RejectedState(Document document, Command command) {
        super(document, command);
    }

    @Override
    public Document onNew() {
        System.out.println("Already created!");
        return document;
    }

    @Override
    public Document onRecons() {
        System.out.println("Going to reconsilation!");
        return document.runCommand(new ReconsilationCommand(document));
    }

    @Override
    public Document onReject() {
        System.out.println("Already rejected!");
        return document;
    }

    @Override
    public Document onDelete() {
        System.out.println("Deleting!");
        return document.runCommand(new DeleteCommand(document));
    }
}
