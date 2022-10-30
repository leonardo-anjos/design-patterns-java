package br.com.alura.store.budget;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private int qtdItem;
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscountValue = BigDecimal.ZERO;

        if (status.equals("REVIEW")) {
            extraDiscountValue = new BigDecimal("0,05");
        } else if (status.equals("APPROVED")) {
            extraDiscountValue = new BigDecimal("0,02");
        }

        this.value = this.value.subtract(extraDiscountValue);
    }
}
