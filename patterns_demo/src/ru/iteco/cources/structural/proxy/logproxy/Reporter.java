package ru.iteco.cources.structural.proxy.logproxy;

public interface Reporter {
    String makeReport(int times) throws InterruptedException;
}
