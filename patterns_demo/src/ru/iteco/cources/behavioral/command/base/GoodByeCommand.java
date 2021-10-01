package ru.iteco.cources.behavioral.command.base;

public class GoodByeCommand extends Command{
    public GoodByeCommand(CommandRunner runner) {
        super(runner);
    }

    @Override
    public boolean execute() {
        runner.setRunnerState("Good bye");

        return true;
    }
}
