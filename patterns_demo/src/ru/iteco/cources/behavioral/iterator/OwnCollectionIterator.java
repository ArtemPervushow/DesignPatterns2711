package ru.iteco.cources.behavioral.iterator;

import java.util.Iterator;

public class OwnCollectionIterator implements Iterator<String> {
    private OwnCollection ownCollection;
    private String currentElement;

    public OwnCollectionIterator(OwnCollection ownCollection) {
        this.ownCollection = ownCollection;
    }

    @Override
    public boolean hasNext() {
        if(currentElement.equals(currentElement.equals(ownCollection.getThird())))
            return false;
        else
            return true;
    }

    @Override
    public String next() {
        if(currentElement == null) {
            currentElement = ownCollection.getFirst();
        } else if(currentElement.equals(ownCollection.getFirst())) {
            currentElement = ownCollection.getSecond();
        } else if(currentElement.equals(ownCollection.getSecond())) {
            currentElement = ownCollection.getThird();
        }

        return currentElement;
    }
}
