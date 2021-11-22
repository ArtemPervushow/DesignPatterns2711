package ru.iteco.cources.poeaa.mvvm;

public class View {
    private ViewModel viewModel;

    public void requestPage() {
        System.out.println(viewModel.requestData());
    }

    public void requestChangeData(String newData){
        viewModel.changeData(newData);
    }

    public void setViewModel(ViewModel viewModel) {
        this.viewModel = viewModel;
    }
}
