package technical.assessment.service;

import technical.assessment.domain.order.base.Baseodr;

public class BillCalculator<T extends Baseodr> {

    private Baseodr T;

    public BillCalculator(T Baseodr) {
        this.T = Baseodr;
    }
    public double calculateDiscount() {
        double discount = 0D;
        if(T.applyPercentageBaseDiscount()) {
            discount = T.getUser().getDiscountRate() * T.getAmount();
        }

        double userDiscountedAmount = T.getAmount() - discount;
        return discount + T.calculateDiscount(userDiscountedAmount);
    }
}