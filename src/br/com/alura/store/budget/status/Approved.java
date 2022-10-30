package br.com.alura.store.budget.status;

import br.com.alura.store.DomainException;
import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetStatus {

    public BigDecimal calculateValueExtraDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    public void toFinish(Budget budget) {
        budget.setStatus(new Finished());
    }
}
