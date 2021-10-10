package ru.iteco.cources.behavioral.statecommandbad;

public class NewCommand extends Command {
    public NewCommand(CommandRunner runner) {
        super(runner);
    }

    @Override
    public Document execute() {
        return commandData.getState().onNew();
    }
}
