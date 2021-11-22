package ru.iteco.cources.behavioral.command.banking;

import java.util.Random;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        BankCommandRunner bankCommandRunner = new BankCommandRunner();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);

            switch (random.nextInt(3)){
                case 0:
                    BankCommand command1 = new AddMoney(bankCommandRunner,
                                            1000f);
                    bankCommandRunner.runCommand(command1);
                    break;
                case 1:
                    BankCommand command2 = new GetMoney(bankCommandRunner,
                                                   1000f);
                    bankCommandRunner.runCommand(command2);
                    break;
                case 2: {
                    BankCommand command3 = new BuyStableCurrency(bankCommandRunner, 1f);
                    bankCommandRunner.runCommand(command3);
                    break;
                }
            }
            System.out.printf("Balance: %.2f%n", bankCommandRunner.getBankBalance());
            System.out.printf("Wheat: %.2f%n", bankCommandRunner.getWheatBalance());
            System.out.println();
        }

        System.out.println("-----------------");

        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);

            bankCommandRunner.undo();
            System.out.printf("Balance: %.2f%n", bankCommandRunner.getBankBalance());
            System.out.printf("Wheat: %.2f%n", bankCommandRunner.getWheatBalance());
            System.out.println();
        }
    }
}
