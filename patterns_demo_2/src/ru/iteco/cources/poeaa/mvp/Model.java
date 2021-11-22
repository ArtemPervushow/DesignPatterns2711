package ru.iteco.cources.poeaa.mvp;

public class Model {
    private String data;
    private Presenter presenter;

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void setData(String data) {
        if(data.equals(this.data)) {
            return;
        }

        this.data = data;

        presenter.populateData(data);
    }
}
