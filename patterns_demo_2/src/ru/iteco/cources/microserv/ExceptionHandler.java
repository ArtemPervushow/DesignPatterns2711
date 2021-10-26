package ru.iteco.cources.microserv;

import java.util.HashMap;
import java.util.Map;

public class ExceptionHandler {
    private static Map<String, String> errorStacktraceMap = new HashMap<>();

    public static String makeProblemRequest(ReportService service, String data){
        try {
            return service.makeReport(data);
        } catch (Exception exception) {
            String errorKey = System.currentTimeMillis() +
                                ":" +
                                 exception.getMessage();

            StringBuilder stackTracebuilder = new StringBuilder();
            for (StackTraceElement element:
                 exception.getStackTrace()) {
                stackTracebuilder.append(element.toString());
            }

            errorStacktraceMap.put(errorKey, stackTracebuilder.toString());

            if(errorStacktraceMap.size() % 20 == 0) {
                printErrorMap();
            }

            return "problem answer (something went wrong)";
        }
    }

    private static void printErrorMap(){
        for (String key:
             errorStacktraceMap.keySet()) {
            System.out.println(key);
            System.out.println(errorStacktraceMap.get(key));
        }
    }
}
