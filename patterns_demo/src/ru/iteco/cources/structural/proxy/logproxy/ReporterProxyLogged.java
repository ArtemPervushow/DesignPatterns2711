package ru.iteco.cources.structural.proxy.logproxy;

public class ReporterProxyLogged implements Reporter {
    private Reporter reporter;

    public ReporterProxyLogged(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public String makeReport(int times) throws InterruptedException {
        System.out.println("Report process started");

        String result = reporter.makeReport(times);

        System.out.println("Report process ended");

        return result;
    }
}
