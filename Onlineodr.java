package technical.assessment.domain.order;

import technical.assessment.domain.order.base.Baseodr;

public class Onlineodr extends Baseodr {

    @Override
    public boolean applyPercentageBaseDiscount() {
        return true;
    }

    @Override
    public double calculateDiscount(double amount) {
        return commonDiscountCalculator(amount);
    }
}
