package ru.iteco.ibykov.patterns.factory;

import ru.iteco.ibykov.patterns.factory.currencydao.CurrencyDao;
import ru.iteco.ibykov.patterns.factory.currencydao.XmlDbCurrencyDaoImpl;
import ru.iteco.ibykov.patterns.factory.itemdao.ItemDao;
import ru.iteco.ibykov.patterns.factory.itemdao.XmlDbItemDaoImpl;

public class XmlDbFactory implements Factory{



    @Override
    public ItemDao createItemDao() {
        return (ItemDao) new XmlDbItemDaoImpl();
    }

    @Override
    public CurrencyDao createCurrencyDao() {
        return new XmlDbCurrencyDaoImpl();
    }
}
