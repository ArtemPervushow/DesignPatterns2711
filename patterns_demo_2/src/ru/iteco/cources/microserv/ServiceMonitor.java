package ru.iteco.cources.microserv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ServiceMonitor {
    private static List<ReportService> reportServiceList = new ArrayList<>();
    private static Random random = new Random();

    static {
        for (int i = 0; i < 10; i++) {
            reportServiceList.add(new ReportService());
        }

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(50);

                for (ReportService service : reportServiceList) {
                    if (service.getErrorChance() >= 10) {
                        reportServiceList.remove(service);
                        //Thread.sleep(100);
                        reportServiceList.add(new ReportService());
                    }
                }
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        });
        thread.start();
    }

    public static ReportService getRandomService() {
        return reportServiceList.get(random.nextInt(10));
    }
}
