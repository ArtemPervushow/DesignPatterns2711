package ru.iteco.cources.khmil.dz.dz1_2;

public class ObjDbFactory implements Factory {
    @Override
    public ItemDao createItemDao() {
        return new ObjDbItemDaoImpl();
    }

    @Override
    public CurrencyDao createCurrencyDao() {
        return new ObjDbCurrencyDaoImpl();
    }
}
