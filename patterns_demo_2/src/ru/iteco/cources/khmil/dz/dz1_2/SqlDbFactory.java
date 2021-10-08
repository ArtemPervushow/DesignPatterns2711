package ru.iteco.cources.khmil.dz.dz1_2;

public class SqlDbFactory implements Factory{
    @Override
    public ItemDao createItemDao() {
        return new SqlDbItemDaoImpl();
    }

    @Override
    public CurrencyDao createCurrencyDao() {
        return new SqlDbCurrencyDaoImpl();
    }
}
