package ru.iteco.cources.microserv;

import java.util.Random;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        while (true) {
            Thread.sleep(100);
            SentryCaller.runWithHandleError(DistributionImitator.getAvailableService(),
                                        random.nextInt(100) + "");
        }
    }
}
