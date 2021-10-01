package ru.iteco.cources.behavioral.command;

import ru.iteco.cources.behavioral.command.base.*;

import java.util.Random;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        CommandRunner commandRunner = new CommandRunner();

        Random random = new Random();
        Command command = null;
        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);

            switch (random.nextInt(3)){
                case 0:
                    command = new SayHelloCommand(commandRunner);
                    break;
                case 1:
                    command = new HowAreYouCommand(commandRunner);
                    break;
                case 2:
                    command = new GoodByeCommand(commandRunner);
                    break;
            }

            commandRunner.runCommand(command);
            System.out.println(commandRunner.getRunnerState());
        }

        System.out.println("---------------------");

        for (int i = 0; i < 9; i++) {
            Thread.sleep(500);

            commandRunner.undo();
            System.out.println(commandRunner.getRunnerState());
        }
    }
}
