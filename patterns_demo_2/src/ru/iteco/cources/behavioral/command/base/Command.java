package ru.iteco.cources.behavioral.command.base;

public abstract class Command {
    protected CommandExecutor commandExecutor;
    protected String previousState;

    public Command(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    protected abstract boolean execute();

    public void undo() {
        commandExecutor.setState(previousState);
    }
}
