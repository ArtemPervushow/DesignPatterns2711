package ru.iteco.cources.structural.proxy.cashed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BigFileSearcher implements SearchPhrase {
    private List<List<String>> source = new LinkedList<>();

    public BigFileSearcher() {
        for (int i = 0; i < 1000; i++) {
            List<String> innerList = new LinkedList<>();
            for (int j = 0; j < 10000; j++) {
                innerList.add(new Random().nextInt(10000000) + "");
            }
            source.add(innerList);
        }
    }

    @Override
    public boolean find(String phrase) {
        for (List<String> innerList:
             source) {
            for (String word:
                 innerList) {
                if(word.equals(phrase)) {
                    return true;
                }
            }
        }
        return false;
    }
}
