package ru.iteco.cources.behavioral.statecommand;

import ru.iteco.cources.behavioral.statecommand.command.ReconsilationCommand;
import ru.iteco.cources.behavioral.statecommand.state.Document;

public class Demo {
    public static void main(String[] args) {
        /*Document document = new Document();
        CommandRunner commandRunner = new CommandRunner();
        document.setState(new NewDocumentState(document,
                                              new NewCommand(commandRunner),
                                                    commandRunner));

        commandRunner.runCommand(new ReconsilationCommand(commandRunner));*/
        Document document = new Document();
        document.runCommand(new ReconsilationCommand(document));
    }
}
