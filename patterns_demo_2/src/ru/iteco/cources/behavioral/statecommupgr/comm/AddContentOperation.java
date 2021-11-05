package ru.iteco.cources.behavioral.statecommupgr.comm;

import ru.iteco.cources.behavioral.statecommupgr.Document;
import ru.iteco.cources.behavioral.statecommupgr.NewState;

public class AddContentOperation extends DocumentOperation{
    private final String content;
    public AddContentOperation(Document document, String content) {
        super(document);
        this.content = content;
    }

    @Override
    public boolean execute() {
        document.setContent(content);
        System.out.println("Added content: " + document.getContent());
        return true;
    }

    @Override
    public boolean isValid() {
        return document.getDocumentState() instanceof NewState;
    }
}
