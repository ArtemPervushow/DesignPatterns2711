package ru.iteco.cources.khmil.dz.dz1_2;

import static ru.iteco.cources.khmil.dz.dz1_2.FactoryType.*;

public class Demo {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        CurrencyDao currencyDaoObj = factoryProducer.createFactory(OBJ).createCurrencyDao();
        CurrencyDao currencyDaoXml = factoryProducer.createFactory(XML).createCurrencyDao();
        ItemDao itemDaoXml = factoryProducer.createFactory(XML).createItemDao();
    }
}
