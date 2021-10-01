package ru.iteco.cources.behavioral.iterator;

import java.util.Iterator;

public class ReportIterator implements Iterator<String> {
    private Report report;
    private String current = "!start of iterator!";
    private int positionInTesis;
    private int positionInRemarks;

    public ReportIterator(Report report) {
        this.report = report;
    }

    @Override
    public boolean hasNext() {
        if(report.getRemarks().size() > 0) {
            if(current.equals(report.getConclusion()) && positionInRemarks == 0) {
                return true;
            }
            return positionInRemarks < report.getRemarks().size();
        } else {
            return !current.equals(report.getConclusion());
        }
    }

    @Override
    public String next() {
        if(current.equals("!start of iterator!")) {
            current = report.getHeader();
        } else if(current.equals(report.getHeader())) {
            current = report.getTheme();
        } else if(current.equals(report.getTheme())) {
            current = report.getAuthor();
        } else if(current.equals(report.getAuthor())
                   || positionInTesis < report.getTesisList().size()) {
            current = report.getTesisList().get(positionInTesis);
            positionInTesis++;
        } else if(positionInTesis == report.getTesisList().size()) {
            positionInTesis++;
            current = report.getConclusion();
        } else if(current.equals(report.getConclusion())
                   || positionInRemarks < report.getRemarks().size()) {
            current = (String) report.getRemarks().toArray()[positionInRemarks];
            positionInRemarks++;
        }

        return current;
    }
}
