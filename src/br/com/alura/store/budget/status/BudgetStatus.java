package br.com.alura.store.budget.status;

import br.com.alura.store.DomainException;
import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public abstract class BudgetStatus {

    public BigDecimal calculateValueExtraDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }

    public void toApprove(Budget budget) {
        throw new DomainException("Budget can't be approved!");
    }

    public void toDisapproved(Budget budget) {
        throw new DomainException("Budget can't be disapproved!");
    }

    public void toFinish(Budget budget) {
        throw new DomainException("Budget can't be finished!");
    }
}
