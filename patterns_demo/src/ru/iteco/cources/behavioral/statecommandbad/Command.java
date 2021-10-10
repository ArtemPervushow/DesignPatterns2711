package ru.iteco.cources.behavioral.statecommandbad;

public abstract class Command {
    CommandRunner runner;
    protected Document commandData;

    public Command(CommandRunner runner) {
        this.runner = runner;
    }

    public abstract Document execute();

    void backup() {
        commandData = runner.getRunnerState();
    }

    public void undo() {
        runner.setRunnerState(commandData);
    }
}
