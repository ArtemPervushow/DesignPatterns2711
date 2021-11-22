package ru.iteco.cources.poeaa.sessions.client;

public class BackEnd {
    private DataSource dataSource;

    public BackEnd(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void handleRequestFromFront(String request) {
        dataSource.storeRequestToDB(request);
    }
}
