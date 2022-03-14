package technical.assessment.testbase.datahelper;

import technical.assessment.domain.order.Grocery;
import technical.assessment.domain.order.MobileOrder;
import technical.assessment.domain.order.Onlineodr;
import technical.assessment.domain.order.base.Baseodr;

public class OrderDOFactory {

    private UserDOFactory userDOFactory;
    private double randomAmount;

    public OrderDOFactory() {
        this.userDOFactory = new UserDOFactory();
        this.randomAmount = Math.random() * 1000D;
    }

    public Baseodr getOnlineodrWithLongTermEmployee() {
        Baseodr order = new Onlineodr();
        order.setAmount(this.randomAmount);
        order.setUser(userDOFactory.getLongTermEmployee());
        return order;
    }

    public Baseodr getOnlineodrWithShortTermEmployee() {
        Baseodr order = new Onlineodr();
        order.setAmount(this.randomAmount);
        order.setUser(userDOFactory.getShortTermEmployee());
        return order;
    }

    public Baseodr getOnlineodrWithLongTermAffiliate() {
        Baseodr order = new Onlineodr();
        order.setAmount(this.randomAmount);
        order.setUser(userDOFactory.getLongTermAffiliate());
        return order;
    }

    public Baseodr getOnlineodrWithShortTermAffiliate() {
        Baseodr order = new Onlineodr();
        order.setAmount(this.randomAmount);
        order.setUser(userDOFactory.getShortTermAffiliate());
        return order;
    }

    public Baseodr getOnlineodrWithLongTermUser() {
        Baseodr order = new Onlineodr();
        order.setAmount(this.randomAmount);
        order.setUser(userDOFactory.getLongTermUser());
        return order;
    }

    public Baseodr getOnlineodrWithShortTermUser() {
        Baseodr order = new Onlineodr();
        order.setAmount(this.randomAmount);
        order.setUser(userDOFactory.getShortTermUser());
        return order;
    }

    public Baseodr getGroceryWithLongTermEmployee() {
        Baseodr order = new Grocery();
        order.setUser(userDOFactory.getLongTermEmployee());
        order.setAmount(this.randomAmount);
        return order;
    }

    public Baseodr getGroceryWithShortTermEmployee() {
        Baseodr order = new Grocery();
        order.setUser(userDOFactory.getShortTermEmployee());
        order.setAmount(this.randomAmount);
        return order;
    }

    public Baseodr getGroceryWithLongTermAffiliate() {
        Baseodr order = new Grocery();
        order.setUser(userDOFactory.getLongTermAffiliate());
        order.setAmount(this.randomAmount);
        return order;
    }

    public Baseodr getGroceryWithShortTermAffiliate() {
        Baseodr order = new Grocery();
        order.setUser(userDOFactory.getShortTermAffiliate());
        order.setAmount(this.randomAmount);
        return order;
    }

    public Baseodr getGroceryWithLongTermUser() {
        Baseodr order = new Grocery();
        order.setUser(userDOFactory.getLongTermUser());
        order.setAmount(this.randomAmount);
        return order;
    }

    public Baseodr getGroceryWithShortTermUser() {
        Baseodr order = new Grocery();
        order.setUser(userDOFactory.getShortTermUser());
        order.setAmount(this.randomAmount);
        return order;
    }
}
