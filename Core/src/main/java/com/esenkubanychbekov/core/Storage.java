package com.esenkubanychbekov.core;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import java.util.Map;

public interface Storage {

    String getName();

    // получение баланса остатка
    Map<Currency, BigDecimal> getCurrentAmount();    // Остаток по каждой доступной валюте в хранилище
    BigDecimal getAmount(Currency currency);        // Остаток по определенной валюте
    BigDecimal getApproxAmount(Currency currency); //примерный остаток в пероводе всех денег в одну валюту


    // изменение баланса
    void changeAmount(BigDecimal amount,Currency currency);     // изменение баланса по определенной валюте
    void addAmount(BigDecimal amount,Currency currency);       // дабавить сумму в валюте
    void expenseAmount(BigDecimal amount,Currency currency);  // отнять сумму в валюте



    //работат с валютой
    void addCurrency(Currency currency);         // добавить новую валюту в хронилище
    void deleteCurrency(Currency currency);     // удалить валюту из хранилища
    void getCurrency(String code);             // получить валюту по коду
    List<Currency> getAvailableCurrencies();  // получить все доступные валюты хранилища в отдельной коллекции
}
