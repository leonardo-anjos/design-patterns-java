package br.com.alura.store.budget.status;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class Disapproved extends BudgetStatus {

    public void toFinish(Budget budget) {
        budget.setStatus(new Finished());
    }
}
