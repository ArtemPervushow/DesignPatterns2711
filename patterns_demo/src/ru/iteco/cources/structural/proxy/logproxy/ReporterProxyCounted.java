package ru.iteco.cources.structural.proxy.logproxy;

public class ReporterProxyCounted implements Reporter {
    private Reporter reporter;

    public ReporterProxyCounted(Reporter reporter) {
        this.reporter = reporter;
    }

    @Override
    public String makeReport(int times) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        String result = reporter.makeReport(times);

        System.out.println("Job time is" + (System.currentTimeMillis() - startTime));

        return result;
    }
}
