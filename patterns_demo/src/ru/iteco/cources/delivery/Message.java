package ru.iteco.cources.delivery;

import java.util.UUID;

public class Message {
    private UUID uuid;
    private String data;

    public Message(UUID uuid, String data) {
        this.uuid = uuid;
        this.data = data;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "uuid=" + uuid +
                ", data='" + data + '\'' +
                '}';
    }
}
