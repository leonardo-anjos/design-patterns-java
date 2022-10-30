package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountOnValue extends Discount {

    public DiscountOnValue(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean mustApply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}