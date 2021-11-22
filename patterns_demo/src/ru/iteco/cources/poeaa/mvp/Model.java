package ru.iteco.cources.poeaa.mvp;

public class Model {
    private Presenter presenter;
    private String currentText;

    public Model(Presenter presenter) {
        this.presenter = presenter;
    }

    public String getCurrentText() {
        return currentText;
    }

    public void setCurrentText(String currentText) {
        this.currentText = currentText;
        presenter.populateText(currentText);
    }
}
