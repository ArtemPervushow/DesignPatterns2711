package ru.iteco.cources.poeaa.mvp;

public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view) {
        this.view = view;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void populateText(String currentText) {
        view.showText(currentText);
    }


    public void getTextEvent(String text) {
        model.setCurrentText(text);
    }
}
