package ru.iteco.cources.poeaa.sessions.back;

public class FrontEnd {
    private BackEnd backEnd;

    public FrontEnd(BackEnd backEnd) {
        this.backEnd = backEnd;
    }

    public void handleUserRequest(String request) {
        backEnd.handleRequestFromFront(request);
    }
}
