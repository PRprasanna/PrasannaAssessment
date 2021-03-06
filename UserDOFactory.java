package technical.assessment.testbase.datahelper;

import technical.assessment.domain.user.Affiliate;
import technical.assessment.domain.user.Employee;
import technical.assessment.domain.user.User;
import technical.assessment.domain.user.base.BaseUser;

import java.time.LocalDate;
import java.time.Month;

public class UserDOFactory {

    public BaseUser getLongTermEmployee() {
        BaseUser user = new Employee();
        user.setFullName("Long Term Employee");
        user.setMembershipDate(LocalDate.of(2018, Month.JANUARY, 1));
        return user;
    }

    public BaseUser getShortTermEmployee() {
        BaseUser user = new Employee();
        user.setFullName("Short Term Employee");
        user.setMembershipDate(LocalDate.of(2021, Month.JANUARY, 1));
        return user;
    }

    public BaseUser getLongTermAffiliate() {
        BaseUser user = new Affiliate();
        user.setFullName("Long Term Affiliate");
        user.setMembershipDate(LocalDate.of(2018, Month.JANUARY, 1));
        return user;
    }

    public BaseUser getShortTermAffiliate() {
        BaseUser user = new Affiliate();
        user.setFullName("Short Term Affiliate");
        user.setMembershipDate(LocalDate.of(2021, Month.JANUARY, 1));
        return user;
    }

    public BaseUser getLongTermUser() {
        BaseUser user = new User();
        user.setFullName("Long Term User");
        user.setMembershipDate(LocalDate.of(2018, Month.JANUARY, 1));
        return user;
    }

    public BaseUser getShortTermUser() {
        BaseUser user = new User();
        user.setFullName("Short Term User");
        user.setMembershipDate(LocalDate.of(2021, Month.JANUARY, 1));
        return user;
    }
}
