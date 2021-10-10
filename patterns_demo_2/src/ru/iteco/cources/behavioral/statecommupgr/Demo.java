package ru.iteco.cources.behavioral.statecommupgr;

import ru.iteco.cources.behavioral.statecommupgr.comm.ReconsilationOperation;

public class Demo {
    public static void main(String[] args) {
        Document document = new Document();
        document.executeDocumentOperation(new ReconsilationOperation(document));
    }
}
