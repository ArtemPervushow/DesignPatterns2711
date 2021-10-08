package ru.iteco.cources.khmil.dz.dz1_2;

public class XmlDbFactory implements Factory {
    @Override
    public ItemDao createItemDao() {
        return new XmlDbItemDaoImpl();
    }

    @Override
    public CurrencyDao createCurrencyDao() {
        return new XmlDbCurrencyDaoImpl();
    }
}
