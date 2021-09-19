package ru.iteco.ibykov.patterns.factory.currencydao;

import ru.iteco.ibykov.patterns.factory.Id;

import java.util.Currency;

public class SqlDbCurrencyDaoImpl implements CurrencyDao{

    @Override
    public Object create(Currency currency) {
        return null;
    }

    @Override
    public Currency read(Id id) {
        return null;
    }

    @Override
    public void update(Currency currency) {

    }

    @Override
    public void delete(Currency currency) {

    }
}
