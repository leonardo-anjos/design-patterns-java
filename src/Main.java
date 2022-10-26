import br.com.alura.store.budget.Budget;
import br.com.alura.store.discount.DiscountCalculator;
import br.com.alura.store.tax.ICMS;
import br.com.alura.store.tax.ISS;
import br.com.alura.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // tax tests
//        Budget budget = new Budget(new BigDecimal("1000"));
//        TaxCalculator calculator = new TaxCalculator();
//        System.out.println("ICMS: " + calculator.calculate(budget, new ICMS()));
//        System.out.println("ISS: " + calculator.calculate(budget, new ISS()));

        // discount tests
        Budget first = new Budget(new BigDecimal("200"), 6);
        Budget second = new Budget(new BigDecimal("1000"), 2);
        Budget thrird = new Budget(new BigDecimal("500"), 1);

        DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println("first: " + discountCalculator.calculate(first));
        System.out.println("second: " + discountCalculator.calculate(second));
        System.out.println("thrird: " + discountCalculator.calculate(thrird));
    }

}