package ru.iteco.cources.behavioral.iterator;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        List<Integer> integers = new LinkedList<>();
        Set<Long> longs = new TreeSet<>();

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
