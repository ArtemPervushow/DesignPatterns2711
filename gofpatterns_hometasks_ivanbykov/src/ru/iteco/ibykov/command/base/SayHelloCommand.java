package ru.iteco.cources.behavioral.command.base;

public class SayHelloCommand extends Command {
    public SayHelloCommand(CommandExecutor commandExecutor) {
        super(commandExecutor);
    }

    @Override
    protected boolean execute() {
        previousState = new String(commandExecutor.getState());//For another object user clone()

        System.out.println("Hello!");

        commandExecutor.setState("Hello!");

        return true;
    }
}
