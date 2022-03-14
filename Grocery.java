package technical.assessment.domain.order;

import technical.assessment.domain.order.base.BaseOrder;

public class Grocery extends BaseOrder {

    @Override
    public boolean applyPercentageBaseDiscount() {
        return false;
    }

    @Override
    public double calculateDiscount(double amount) {
        return commonDiscountCalculator(amount);
    }
}
