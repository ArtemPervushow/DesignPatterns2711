package ru.iteco.ibykov.patterns.factory;

import ru.iteco.ibykov.patterns.factory.currencydao.*;
import ru.iteco.ibykov.patterns.factory.itemdao.*;

public class ObjDbFactory implements Factory{

    @Override
    public ItemDao createItemDao() {
        return (ItemDao) new ObjDbItemDaoImpl();
    }

    @Override
    public CurrencyDao createCurrencyDao() {
        return new ObjDbCurrencyDaoImpl();
    }
}
