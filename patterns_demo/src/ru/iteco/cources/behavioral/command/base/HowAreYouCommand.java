package ru.iteco.cources.behavioral.command.base;

public class HowAreYouCommand extends Command {
    public HowAreYouCommand(CommandRunner runner) {
        super(runner);
    }

    @Override
    public boolean execute() {
        runner.setRunnerState("How are you?");

        return true;
    }
}
