package ru.iteco.cources.behavioral.statecommandbad;

import java.util.List;

public class Document {
    private DocumentState state;
    private List<String> content;

    public DocumentState getState() {
        return state;
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void addData(String data) {
        if (state instanceof NewDocumentState) {
            content.add(data);
        }
    }
}
