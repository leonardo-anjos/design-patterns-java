package br.com.alura.store.budget.status;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class Review extends BudgetStatus {

    public BigDecimal calculateValueExtraDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    public void toApprove(Budget budget) {
        budget.setStatus(new Approved());
    }

    public void toDisapproved(Budget budget) {
        budget.setStatus(new Disapproved());
    }
}
