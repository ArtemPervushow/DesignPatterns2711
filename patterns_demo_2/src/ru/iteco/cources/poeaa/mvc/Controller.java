package ru.iteco.cources.poeaa.mvc;

public class Controller {
    private Model model;
    private View view;

    public void setModel(Model model) {
        this.model = model;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void clearText(){
        model.setData("");
        view.showText();
    }

    public void appendText(String newText) {
        StringBuilder currentTextBuilder = new StringBuilder(model.getData());
        currentTextBuilder.append(newText);

        model.setData(currentTextBuilder.toString());

        view.showText();
    }
}
