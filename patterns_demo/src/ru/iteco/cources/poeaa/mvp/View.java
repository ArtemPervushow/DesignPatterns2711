package ru.iteco.cources.poeaa.mvp;

public class View {
    private Presenter presenter;

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void showText(String text) {
        System.out.println(text);
    }

    public void changeText(String text) {
        presenter.getTextEvent(text);
    }
}
