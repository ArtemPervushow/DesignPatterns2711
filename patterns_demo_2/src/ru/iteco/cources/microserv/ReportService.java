package ru.iteco.cources.microserv;

public class ReportService {
    private int errorChance = 0;

    public String makeReport(String data) throws Exception {
        StringBuilder sb = new StringBuilder("Report from data ");
        sb.append(data);

        errorChance++;
        if(errorChance > 10) {
            throw new Exception("Some error");
        }

        return sb.toString();
    }

    public int getErrorChance() {
        return errorChance;
    }
}
