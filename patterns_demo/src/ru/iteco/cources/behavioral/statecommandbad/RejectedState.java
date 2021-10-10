package ru.iteco.cources.behavioral.statecommandbad;

public class RejectedState extends DocumentState {
    public RejectedState(Document document, Command command, CommandRunner commandRunner) {
        super(document, command, commandRunner);
    }

    @Override
    public Document onNew() {
        System.out.println("Already created!");
        return document;
    }

    @Override
    public Document onRecons() {
        System.out.println("Going to reconsilation!");
        return commandRunner.runCommand(new ReconsilationCommand(commandRunner));
    }

    @Override
    public Document onReject() {
        System.out.println("Already rejected!");
        return document;
    }

    @Override
    public Document onDelete() {
        System.out.println("Deleting!");
        return commandRunner.runCommand(new DeleteCommand(commandRunner));
    }
}
