package ru.iteco.cources.behavioral.statecommandbad;

public class RejectCommand extends Command {
    public RejectCommand(CommandRunner runner) {
        super(runner);
    }

    @Override
    public Document execute() {
        return commandData.getState().onReject();
    }
}
