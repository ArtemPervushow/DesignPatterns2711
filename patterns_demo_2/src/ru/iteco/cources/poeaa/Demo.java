package ru.iteco.cources.poeaa;

import ru.iteco.cources.poeaa.mvc.Controller;
import ru.iteco.cources.poeaa.mvc.Model;
import ru.iteco.cources.poeaa.mvc.View;

public class Demo {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller();

        view.setModel(model);
        view.setController(controller);
        controller.setModel(model);
        controller.setView(view);

        controller.clearText();
        controller.appendText("Artem");
    }
}
