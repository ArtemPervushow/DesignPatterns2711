package ru.iteco.cources.microserv;

import java.io.Serializable;
import java.util.Random;

public class Demo {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        while (true) {
            Thread.sleep(100);

            ReportService reportService = ServiceMonitor.getRandomService();
            System.out.println(reportService.toString());

            String result =
                    ExceptionHandler.makeProblemRequest(reportService,
                                          random.nextInt(100) +"");

            System.out.println(result);
        }
    }
}
