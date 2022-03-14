package technical.assessment;

import technical.assessment.domain.order.Grocery;
import technical.assessment.domain.order.Onlineodr;
import technical.assessment.domain.order.base.Baseodr;
import technical.assessment.domain.user.Affiliate;
import technical.assessment.domain.user.Employee;
import technical.assessment.domain.user.User;
import technical.assessment.domain.user.base.BaseUser;
import technical.assessment.service.BillCalculator;

import java.time.LocalDate;
import java.time.Month;

public class main {

    public static void main(String[] args) {
        Baseodr order;
        BaseUser user;

        user = new Employee();
        user.setFullName(" Prasanna ");
        user.setMembershipDate(LocalDate.of(2021, Month.FEBRUARY, 1));

        order = new Onlineodr();
        order.setAmount(1000D);
        order.setUser(user);

        printResults(order);

        user = new Employee();
        user.setFullName("Adam");
        user.setMembershipDate(LocalDate.of(2019, Month.JANUARY, 1));

        order = new Onlineodr();
        order.setAmount(1000D);
        order.setUser(user);

        printResults(order);

        user = new Affiliate();
        user.setFullName("Agni");
        user.setMembershipDate(LocalDate.of(2018, Month.JANUARY, 1));

        order = new Onlineodr();
        order.setAmount(1000D);
        order.setUser(user);

        printResults(order);

        user = new User();
        user.setFullName("Micheal");
        user.setMembershipDate(LocalDate.of(2016, Month.JANUARY, 1));

        order = new Grocery();
        order.setAmount(1000D);
        order.setUser(user);

        printResults(order);

        user = new Employee();
        user.setFullName("Robert");
        user.setMembershipDate(LocalDate.of(2019, Month.JANUARY, 1));

        order = new Onlineodr();
        order.setAmount(1000D);
        order.setUser(user);

        printResults(order);
    }

    public static void printResults(Baseodr order) {
        BillCalculator shoppingCard = new BillCalculator<>(order);
        double discount = shoppingCard.calculateDiscount();

        System.out.println("*****************************************************" );
        System.out.println(order.getUser().getFullName());
        System.out.println("Amount       : " + order.getAmount());
        System.out.println("Discount     : " + discount);
        System.out.println("Total Amount : " + (order.getAmount() - discount));
        System.out.println("\n");
    }
}
