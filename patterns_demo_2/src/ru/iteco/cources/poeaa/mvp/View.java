package ru.iteco.cources.poeaa.mvp;

public class View {
    private Presenter presenter;

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void requestChangeText(String newText) {
        presenter.processData(newText);
    }

    public void showText(String data) {
        System.out.println(this.toString() + " showed " + data);
    }
}
