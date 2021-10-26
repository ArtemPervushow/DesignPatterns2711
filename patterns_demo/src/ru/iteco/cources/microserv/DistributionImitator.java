package ru.iteco.cources.microserv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistributionImitator {
    private static List<AnswerService> answerServiceList = new ArrayList<>();
    private static Random random = new Random();

    static {
        for (int i = 0; i < 10; i++) {
            answerServiceList.add(new AnswerService());
        }

        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (AnswerService service:
                     answerServiceList) {
                    int currentCount = SentryCaller
                                        .serviceErrorCountMap
                                        .get(service.toString());
                    if(currentCount >= 5) {
                        answerServiceList.remove(service);
                        answerServiceList.add(new AnswerService());
                    }
                }
            }
        });
        thread.start();
    }

    public static AnswerService getAvailableService(){
        return answerServiceList.get(random.nextInt(10));
    }
}
