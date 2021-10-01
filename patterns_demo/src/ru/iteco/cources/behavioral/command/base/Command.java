package ru.iteco.cources.behavioral.command.base;

public abstract class Command {
    CommandRunner runner;
    private String commandData; //Could be not only String

    public Command(CommandRunner runner) {
        this.runner = runner;
    }

    public abstract boolean execute();

    void backup() {
        commandData = runner.getRunnerState();
    }

    public void undo() {
        runner.setRunnerState(commandData);
    }
}
