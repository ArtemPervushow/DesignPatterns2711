package ru.iteco.cources.khmil.dz.dz1_2;

public interface Factory {
    ItemDao createItemDao();
    CurrencyDao createCurrencyDao();
}
