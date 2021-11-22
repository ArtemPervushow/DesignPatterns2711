package ru.iteco.cources.poeaa.mvc;

public class Controller {
    private Model model;
    private View view;
    private boolean isTextFilled;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public boolean isTextFilled() {
        return isTextFilled;
    }

    public void setTextFilled(boolean textFilled) {
        isTextFilled = textFilled;
    }

    public void setText(String newText) {
        if(isTextFilled) {
            for (int i = 0; i < model.getText().length(); i++) {
                model.removeLastSymbol();
            }
        }

        model.appendText(newText);
        view.printView();
    }
}
