package ru.iteco.cources.cqrsevent;

public class CancelData extends EventData {
    private final int targetId;

    public CancelData(int id) {
        this.targetId = id;
    }

    public int getTargetId() {
        return targetId;
    }
}
