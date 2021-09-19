package ru.iteco.ibykov.patterns.factory;

import ru.iteco.ibykov.patterns.factory.currencydao.CurrencyDao;
import ru.iteco.ibykov.patterns.factory.itemdao.ItemDao;

public interface Factory {
    ItemDao createItemDao();
    CurrencyDao createCurrencyDao();
}
