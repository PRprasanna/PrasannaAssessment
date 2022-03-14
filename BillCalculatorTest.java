package technical.assessment.service;

import org.junit.Test;
import technical.assessment.domain.order.base.Baseodr;
import technical.assessment.testbase.TestBase;

import static org.junit.Assert.*;

public class BillCalculatorTest {

    @Test
    public void calculateDiscount() {
        testOnlineodrWithLongTermEmployee();
        testOnlineodrWithShortTermEmployee();
        testOnlineodrWithLongTermAffiliate();
        testOnlineodrWithShortTermAffiliate();
        testOnlineodrWithLongTermUser();
        testOnlineodrWithShortTermUser();

        testGroceryWithLongTermEmployee();
        testGroceryWithShortTermEmployee();
        testGroceryWithLongTermAffiliate();
        testGroceryWithShortTermAffiliate();
        testGroceryWithLongTermUser();
        testGroceryWithShortTermUser();
    }

    private void testOnlineodrWithLongTermEmployee() {
        Baseodr order = TestBase.orderDOFactory.getOnlineodrWithLongTermEmployee();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testOnlineodrWithShortTermEmployee() {
        Baseodr order = TestBase.orderDOFactory.getOnlineodrWithShortTermEmployee();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testOnlineodrWithLongTermAffiliate() {
        Baseodr order = TestBase.orderDOFactory.getOnlineodrWithLongTermAffiliate();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testOnlineodrWithShortTermAffiliate() {
        Baseodr order = TestBase.orderDOFactory.getOnlineodrWithShortTermAffiliate();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testOnlineodrWithLongTermUser() {
        Baseodr order = TestBase.orderDOFactory.getOnlineodrWithLongTermUser();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testOnlineodrWithShortTermUser() {
        Baseodr order = TestBase.orderDOFactory.getOnlineodrWithShortTermUser();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }


    private void testGroceryWithLongTermEmployee() {
        Baseodr order = TestBase.orderDOFactory.getGroceryWithLongTermEmployee();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testGroceryWithShortTermEmployee() {
        Baseodr order = TestBase.orderDOFactory.getGroceryWithShortTermEmployee();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testGroceryWithLongTermAffiliate() {
        Baseodr order = TestBase.orderDOFactory.getGroceryWithLongTermAffiliate();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testGroceryWithShortTermAffiliate() {
        Baseodr order = TestBase.orderDOFactory.getGroceryWithShortTermAffiliate();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testGroceryWithLongTermUser() {
        Baseodr order = TestBase.orderDOFactory.getGroceryWithLongTermUser();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testGroceryWithShortTermUser() {
        Baseodr order = TestBase.orderDOFactory.getGroceryWithShortTermUser();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }


    private double testCalculateDiscount(Baseodr order) {
        double discount = 0D;
        if (order.applyPercentageBaseDiscount()) {
            discount = order.getAmount() * order.getUser().getDiscountRate();
        }

        double userDiscountedAmount = order.getAmount() - discount;
        return discount + order.calculateDiscount(userDiscountedAmount);
    }

    private double getOrderDiscount(double discountedAmount, Baseodr order) {
        return order.calculateDiscount(discountedAmount);
    }
}