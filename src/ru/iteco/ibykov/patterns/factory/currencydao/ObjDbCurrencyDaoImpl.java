package ru.iteco.ibykov.patterns.factory.currencydao;

import ru.iteco.ibykov.patterns.factory.Id;
import ru.iteco.ibykov.patterns.factory.itemdao.Item;

import java.util.Currency;

public class ObjDbCurrencyDaoImpl implements CurrencyDao {

    @Override
    public Object create(Currency currency) {
        return null;
    }

    @Override
    public Currency read(Id id) {
        return null;//must be implemented in real life
    }

    @Override
    public void update(Currency currency) {

    }

    @Override
    public void delete(Currency currency) {

    }
}
