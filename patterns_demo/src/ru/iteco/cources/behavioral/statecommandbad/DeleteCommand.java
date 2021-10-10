package ru.iteco.cources.behavioral.statecommandbad;

public class DeleteCommand extends Command {
    public DeleteCommand(CommandRunner runner) {
        super(runner);
    }

    @Override
    public Document execute() {
        return commandData.getState().onDelete();
    }
}
