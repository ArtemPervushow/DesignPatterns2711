package ru.iteco.cources.structural.proxy.logproxy;

import java.util.Random;

public class ReporterIml implements Reporter {
    @Override
    public String makeReport(int times) throws InterruptedException {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            Thread.sleep(new Random().nextInt(2000));
            builder.append("Some report\n");
        }
        return builder.toString();
    }
}
