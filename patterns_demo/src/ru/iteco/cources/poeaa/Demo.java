package ru.iteco.cources.poeaa;

import ru.iteco.cources.poeaa.mvc.Controller;
import ru.iteco.cources.poeaa.mvc.Model;
import ru.iteco.cources.poeaa.mvc.View;

public class Demo {
    public static void main(String[] args) {
        Model model = new Model();
        model.appendText("Artem");

        View view = new View(model);
        Controller controller = new Controller(model, view);
        view.setController(controller);

        view.printView();
        controller.setText("Denis");
    }
}
