package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget) {
        if (mustApply(budget)) {
            return performCalculation(budget);
        }

        return next.calculate(budget);
    }

    public abstract BigDecimal performCalculation(Budget budget);

    public abstract boolean mustApply(Budget budget);
}
