package ru.iteco.cources.behavioral.command.base;

public class SayHelloCommand extends Command{
    public SayHelloCommand(CommandRunner runner) {
        super(runner);
    }

    @Override
    public boolean execute() {
        runner.setRunnerState("Hello!");

        return true;
    }
}
