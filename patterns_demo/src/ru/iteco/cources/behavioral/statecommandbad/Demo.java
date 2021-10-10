package ru.iteco.cources.behavioral.statecommandbad;

public class Demo {
    public static void main(String[] args) {
        Document document = new Document();
        CommandRunner commandRunner = new CommandRunner();
        document.setState(new NewDocumentState(document,
                                              new NewCommand(commandRunner),
                                                    commandRunner));

        commandRunner.runCommand(new ReconsilationCommand(commandRunner));
    }
}
