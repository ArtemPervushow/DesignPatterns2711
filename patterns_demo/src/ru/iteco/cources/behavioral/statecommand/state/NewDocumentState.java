package ru.iteco.cources.behavioral.statecommand.state;

import ru.iteco.cources.behavioral.statecommand.command.Command;
import ru.iteco.cources.behavioral.statecommand.command.DeleteCommand;
import ru.iteco.cources.behavioral.statecommand.command.ReconsilationCommand;

public class NewDocumentState extends DocumentState {
    public NewDocumentState(Document document, Command command) {
        super(document, command);
    }

    @Override
    public Document onNew() {
        System.out.println("Already new!");
        return document;
    }

    @Override
    public Document onRecons() {
        System.out.println("Going to reconsilation");
        return document.setState(new ReconsilationState(document,
                                 new ReconsilationCommand(document)));
    }

    @Override
    public Document onReject() {
        System.out.println("We are on new!");
        return document;
    }

    @Override
    public Document onDelete() {
        System.out.println("Deleting document!");
        return document.runCommand(new DeleteCommand(document));
    }
}
