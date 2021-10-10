package ru.iteco.cources.behavioral.statecommandbad;

public class ReconsilationCommand extends Command {
    public ReconsilationCommand(CommandRunner runner) {
        super(runner);
    }

    @Override
    public Document execute() {
        return commandData.getState().onRecons();
    }
}
