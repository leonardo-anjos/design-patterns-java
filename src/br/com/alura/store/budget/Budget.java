package br.com.alura.store.budget;

import br.com.alura.store.budget.status.BudgetStatus;
import br.com.alura.store.budget.status.Review;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private int qtdItem;
    private BudgetStatus status;

    public Budget(BigDecimal value, int qtdItem) {
        this.value = value;
        this.qtdItem = qtdItem;
        this.status = new Review();
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public BudgetStatus getStatus() {
        return status;
    }

    public void setStatus(BudgetStatus status) {
        this.status = status;
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscountValue = this.status.calculateValueExtraDiscount(this);
        this.value = this.value.subtract(extraDiscountValue);
    }

    public void toApprove() {
        this.status.toApprove(this);
    }

    public void toDisapprove() {
        this.status.toDisapproved(this);
    }

    public void toFinish() {
        this.status.toFinish(this);
    }
}
