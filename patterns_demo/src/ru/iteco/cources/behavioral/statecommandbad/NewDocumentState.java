package ru.iteco.cources.behavioral.statecommandbad;

public class NewDocumentState extends DocumentState {
    public NewDocumentState(Document document, Command command, CommandRunner commandRunner) {
        super(document, command, commandRunner);
    }

    @Override
    public Document onNew() {
        System.out.println("Already new!");
        return document;
    }

    @Override
    public Document onRecons() {
        System.out.println("Going to reconsilation");
        return commandRunner.runCommand(new ReconsilationCommand(commandRunner));
    }

    @Override
    public Document onReject() {
        System.out.println("We are on new!");
        return document;
    }

    @Override
    public Document onDelete() {
        System.out.println("Deleting document!");
        return commandRunner.runCommand(new DeleteCommand(commandRunner));
    }
}
