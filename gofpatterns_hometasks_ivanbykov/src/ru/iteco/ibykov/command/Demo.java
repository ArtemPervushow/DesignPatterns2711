package ru.iteco.ibykov.command;

import ru.iteco.ibykov.command.banking.*;

import java.util.Random;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        /*
        CommandExecutor commandExecutor = new CommandExecutor();

        Random random = new Random();
        Command command;
        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);

            switch (random.nextInt(3)) {
                case 0:
                    command = new SayHelloCommand(commandExecutor);
                    break;
                case 1:
                    command = new HowAreYouCommand(commandExecutor);
                    break;
                default:
                    command = new GoodByeCommand(commandExecutor);
                    break;
            }
            commandExecutor.executeCommand(command);
        }

        System.out.println("----------------------------");

        for (int i = 0; i < random.nextInt(10) + 1; i++) {
            commandExecutor.undoLastCommand();
            System.out.println(commandExecutor.getState());
        }
    }
    */

    }
}