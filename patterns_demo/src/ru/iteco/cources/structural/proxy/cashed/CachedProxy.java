package ru.iteco.cources.structural.proxy.cashed;

import java.util.ArrayList;
import java.util.List;

public class CachedProxy implements SearchPhrase {
    private SearchPhrase searchPhrase;
    private List<String> foundPhrases = new ArrayList<>();

    public CachedProxy(SearchPhrase searchPhrase) {
        this.searchPhrase = searchPhrase;
    }

    @Override
    public boolean find(String phrase) {
        if(foundPhrases.contains(phrase)) {
            return true;
        }

        boolean result = searchPhrase.find(phrase);

        if(result) {
            foundPhrases.add(phrase);
        }

        return result;
    }
}
