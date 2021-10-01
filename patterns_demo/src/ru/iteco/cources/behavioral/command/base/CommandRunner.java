package ru.iteco.cources.behavioral.command.base;

public class CommandRunner {
    private String runnerState;
    private CommandHistory commandHistory = new CommandHistory();

    public String getRunnerState() {
        return runnerState;
    }

    public void setRunnerState(String runnerState) {
        this.runnerState = runnerState;
    }

    public void runCommand(Command command) {
        command.backup();
        if(command.execute()) {
            commandHistory.push(command);
        }
    }

    public void undo() {
        if(commandHistory.isEmpty()){
            return;
        }

        Command command = commandHistory.pop();
        if(command != null) {
            command.undo();
        }
    }
}
