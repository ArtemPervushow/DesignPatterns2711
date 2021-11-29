package ru.iteco.cources.cqrsevent;

public class CancellData extends EventData {
    int cancelledId;

    public CancellData(int cancelledId) {
        this.cancelledId = cancelledId;
    }

    public int getCancelledId() {
        return cancelledId;
    }

}
