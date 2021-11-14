package ru.iteco.cources.behavioral.command.base;

public class GoodByeCommand extends Command {
    public GoodByeCommand(CommandExecutor commandExecutor) {
        super(commandExecutor);
    }

    @Override
    protected boolean execute() {
        previousState = commandExecutor.getState();

        System.out.println("Good bye!");
        commandExecutor.setState("Good bye!");

        return true;
    }
}
