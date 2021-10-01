package ru.iteco.cources.behavioral.iterator;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");

        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        Set<String> remarks = new HashSet<>();
        remarks.add("First");
        remarks.add("Second");

        Report report = new Report("Header", "Important", "Artem",
                Arrays.asList("One", "Two", "Three"), "All good",
                remarks);

        ReportIterator reportIterator = new ReportIterator(report);
        while (reportIterator.hasNext()) {
            System.out.println(reportIterator.next());
        }
    }
}
