package ru.iteco.cources.behavioral.statecommandbad;

public class Document {
    private DocumentState state;

    public DocumentState getState() {
        return state;
    }

    public void setState(DocumentState state) {
        this.state = state;
    }
}
