package ru.iteco.cources.behavioral.statecommupgr;

import ru.iteco.cources.behavioral.statecommupgr.comm.AddContentOperation;
import ru.iteco.cources.behavioral.statecommupgr.comm.DocState;
import ru.iteco.cources.behavioral.statecommupgr.comm.ReconsilationOperation;
import ru.iteco.cources.behavioral.statecommupgr.comm.ResetOperation;

public class Demo {
    public static void main(String[] args) {
        Document document = new Document();
        document.executeDocumentOperation(new ReconsilationOperation(document));
        System.out.println(document.getDocumentState());

        document.executeDocumentOperation(new ResetOperation(document, DocState.NEW));
        System.out.println(document.getDocumentState());
        document.executeDocumentOperation(new AddContentOperation(document,"NEW CONTENT1"));
        System.out.println(document.getContent());

        document.executeDocumentOperation(new ResetOperation(document, DocState.APPROVE));
        System.out.println(document.getDocumentState());
        document.executeDocumentOperation(new AddContentOperation(document,"NEW CONTENT2"));
        System.out.println(document.getContent());

        document.executeDocumentOperation(new ResetOperation(document, DocState.NEW));
        System.out.println(document.getDocumentState());
        document.executeDocumentOperation(new AddContentOperation(document,"NEW CONTENT2"));
        System.out.println(document.getContent());
    }
}
