package ru.iteco.cources.behavioral.statecommand.comm;

import ru.iteco.cources.behavioral.statecommand.Document;

public abstract class DocumentOperation {
    Document document; //AS Command Runner

    public abstract boolean execute();
}
