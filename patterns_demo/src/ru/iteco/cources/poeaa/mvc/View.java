package ru.iteco.cources.poeaa.mvc;

public class View {
    private Model model;
    private Controller controller;

    public View(Model model) {
        this.model = model;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void printView() {
        if(model.getText().isEmpty()) {
            controller.setTextFilled(false);
        } else {
            controller.setTextFilled(true);
        }

        System.out.println(model.getText());
    }
}
