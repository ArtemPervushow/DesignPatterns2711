package ru.iteco.cources.behavioral.command.banking;

import java.util.Stack;

public class BankCommandHistory {
    private Stack<BankCommand> history = new Stack<>();

    public void push(BankCommand command) {
        history.push(command);
    }

    public BankCommand pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
