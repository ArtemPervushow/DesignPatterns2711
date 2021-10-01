package ru.iteco.cources.behavioral.iterator;

import java.util.List;
import java.util.Set;

public class Report {
    private String header;
    private String theme;
    private String author;
    private List<String> tesisList;
    private String conclusion;
    private Set<String> remarks;

    public Report(String header, String theme, String author, List<String> tesisList, String conclusion, Set<String> remarks) {
        this.header = header;
        this.theme = theme;
        this.author = author;
        this.tesisList = tesisList;
        this.conclusion = conclusion;
        this.remarks = remarks;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getTesisList() {
        return tesisList;
    }

    public void setTesisList(List<String> tesisList) {
        this.tesisList = tesisList;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public Set<String> getRemarks() {
        return remarks;
    }

    public void setRemarks(Set<String> remarks) {
        this.remarks = remarks;
    }
}
