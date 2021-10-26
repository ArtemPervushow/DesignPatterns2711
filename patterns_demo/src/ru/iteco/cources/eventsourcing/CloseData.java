package ru.iteco.cources.eventsourcing;

public class CloseData extends EventData {
    private final String reason;

    public CloseData(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
