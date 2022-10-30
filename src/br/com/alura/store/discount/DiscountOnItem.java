package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountOnItem extends Discount {

    public DiscountOnItem(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean mustApply(Budget budget) {
        return budget.getQtdItem() > 5;
    }
}
