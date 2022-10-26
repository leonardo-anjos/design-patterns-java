package br.com.alura.store.budget;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private int qtdItem;

    public Budget(BigDecimal value, int qtdItem) {
        this.value = value;
        this.qtdItem = qtdItem;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQtdItem() {
        return qtdItem;
    }
}
