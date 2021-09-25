package ru.iteco.cources.structural.proxy.logged;

import java.util.Random;

public class ReporterIml implements Reporter {
    @Override
    public String makeReport(int times) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < times; i++) {
            Thread.sleep(random.nextInt(2000));

            stringBuilder.append(random.nextInt(1000));
        }

        return stringBuilder.toString();
    }
}
