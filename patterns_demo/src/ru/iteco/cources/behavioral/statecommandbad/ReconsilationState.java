package ru.iteco.cources.behavioral.statecommandbad;

public class ReconsilationState extends DocumentState {
    public ReconsilationState(Document document, Command command, CommandRunner commandRunner) {
        super(document, command, commandRunner);
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
        return commandRunner.runCommand(new RejectCommand(commandRunner));
    }

    @Override
    public Document onDelete() {
        System.out.println("Deleting!");
        return commandRunner.runCommand(new DeleteCommand(commandRunner));
    }
}
