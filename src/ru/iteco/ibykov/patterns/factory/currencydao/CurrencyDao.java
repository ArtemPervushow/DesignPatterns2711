package ru.iteco.ibykov.patterns.factory.currencydao;

import ru.iteco.ibykov.patterns.factory.Id;

import java.util.Currency;

public interface CurrencyDao
{
    Object create(Currency currency);
    Currency read(Id id);
    void update(Currency currency);
    void delete(Currency currency);
}
