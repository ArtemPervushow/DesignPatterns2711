package ru.iteco.cources.poeaa.mvvm;

public class View {
    private ViewModel viewModel;

    public View(ViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public void printText() {
        try {
            System.out.println(viewModel.getTextFromModel());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void updateText(String text) {
        try {
            viewModel.setTextToModel(text);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
