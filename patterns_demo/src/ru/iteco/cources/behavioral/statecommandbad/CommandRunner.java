package ru.iteco.cources.behavioral.statecommandbad;

public class CommandRunner {
    private Document runnerState;
    private CommandHistory commandHistory = new CommandHistory();

    public Document getRunnerState() {
        return runnerState;
    }

    public void setRunnerState(Document runnerState) {
        this.runnerState = runnerState;
    }

    public Document runCommand(Command command) {
        command.backup();
        Document result = command.execute();
        if(result != null) {
            commandHistory.push(command);
        }

        return result;
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
