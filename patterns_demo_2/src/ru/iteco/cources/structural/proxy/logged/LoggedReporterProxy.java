package ru.iteco.cources.structural.proxy.logged;

public class LoggedReporterProxy implements Reporter {
    private Reporter reporter;

    public LoggedReporterProxy(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public String makeReport(int times) throws Exception {
        System.out.println("LOG: start generate report " + times + " times");

        String result = reporter.makeReport(times);

        System.out.println("LOG: end generate report " + times + " times");

        return result;
    }
}
