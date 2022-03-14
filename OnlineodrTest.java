package technical.assessment.domain.order;

import org.junit.Assert;
import org.junit.Test;
import technical.assessment.domain.order.base.Baseodr;
import technical.assessment.testbase.TestBase;

import static org.junit.Assert.*;

public class OnlineodrTest {
    private final int OVER_HUNDRED_DISCOUNT = 5;
    private final int DISCOUNT_LIMIT = 100;

    @Test
    public void applyPercentageBaseDiscount() {
        Baseodr Baseodr = TestBase.orderDOFactory.getOnlineodrWithLongTermUser();

        assertEquals(Baseodr.applyPercentageBaseDiscount(), true);
    }

    @Test
    public void calculateDiscount() {
        Baseodr Baseodr = TestBase.orderDOFactory.getOnlineodrWithShortTermUser();
        double actual = Baseodr.calculateDiscount(Baseodr.getAmount());


        Double rate = Baseodr.getAmount() / DISCOUNT_LIMIT;
        double expectedDiscount = rate.intValue() * OVER_HUNDRED_DISCOUNT;

        Assert.assertEquals(actual, expectedDiscount, 0.01);
    }
}