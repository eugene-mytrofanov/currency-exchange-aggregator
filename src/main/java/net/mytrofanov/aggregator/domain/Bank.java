package net.mytrofanov.aggregator.domain;

import java.util.List;

public class Bank {

    private String name;
    private List<CurrencyOffer> currencyOffers;

    public Bank(String name, List<CurrencyOffer> currencyOffers) {
        this.name = name;
        this.currencyOffers = currencyOffers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CurrencyOffer> getCurrencyOffers() {
        return currencyOffers;
    }

    public void setCurrencyOffers(List<CurrencyOffer> currencyOffers) {
        this.currencyOffers = currencyOffers;
    }
}
