package ru.iteco.ibykov.patterns.factory;

import ru.iteco.ibykov.patterns.factory.currencydao.CurrencyDao;
import ru.iteco.ibykov.patterns.factory.currencydao.ObjDbCurrencyDaoImpl;
import ru.iteco.ibykov.patterns.factory.itemdao.ItemDao;
import ru.iteco.ibykov.patterns.factory.itemdao.SqlDbItemDaoImpl;

public class SqlDbFactory implements Factory{


    @Override
    public ItemDao createItemDao() {
        return (ItemDao) new SqlDbItemDaoImpl();
    }

    @Override
    public CurrencyDao createCurrencyDao() {
        return new ObjDbCurrencyDaoImpl();
    }
}
