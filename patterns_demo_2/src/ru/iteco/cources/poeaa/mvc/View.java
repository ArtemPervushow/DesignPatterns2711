package ru.iteco.cources.poeaa.mvc;

public class View {
    private Model model;
    private Controller controller;

    public void setModel(Model model) {
        this.model = model;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void showText() {
        System.out.println(model.getData());
    }
}
