package ru.iteco.cources.microserv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SentryCaller {
    private static List<String> errorList = new ArrayList<>();
    private static Map<String, String> errorStackMap = new HashMap<>();
    private static int errCounter = 0;
    public static Map<String, Integer> serviceErrorCountMap = new HashMap<>();

    public static void runWithHandleError(AnswerService answerService, String request) {
        String answer;
        try {
            answer = answerService.answer(request);
        } catch (Exception exception) {
            answer = "Something went wrong";
            errorList.add(exception.getMessage());

            String errorTime = ":" + System.currentTimeMillis() + " ";
            errorStackMap.put(errorTime + exception.getMessage(),
                              exception.getStackTrace().toString());
            errCounter++;

            if(errCounter > 5) {
                for (String err:
                     errorList) {
                    System.out.println(err);
                }
            }

            if(errCounter > 10) {
                for (String key:
                     errorStackMap.keySet()) {
                    System.out.println(key);
                    System.out.println(errorStackMap.get(key));
                }
            }

            if(serviceErrorCountMap.get(answerService.toString()) == null) {
                serviceErrorCountMap.put(answerService.toString(), 1);
            } else {
                serviceErrorCountMap.put(answerService.toString(),
                                         serviceErrorCountMap.get(answerService.toString()) + 1);
            }
        }

        System.out.println(answer);
    }
}
