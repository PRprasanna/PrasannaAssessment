package technical.assessment.domain.user.base;

import org.junit.Test;
import technical.assessment.domain.user.Affiliate;
import technical.assessment.domain.user.Employee;
import technical.assessment.testbase.TestBase;

import static org.junit.Assert.*;

public class BaseUserTest {

    @Test
    public void getFullName() {
        BaseUser user = TestBase.userDOFactory.getLongTermAffiliate();
        BaseUser expectedUser = TestBase.userDOFactory.getLongTermAffiliate();

        assertNotNull(user);
        assertEquals(user.getFullName(), expectedUser.getFullName());
    }

    @Test
    public void getMembershipDate() {
        BaseUser user = TestBase.userDOFactory.getLongTermAffiliate();
        BaseUser expectedUser = TestBase.userDOFactory.getLongTermAffiliate();

        assertNotNull(user);
        assertEquals(user.getMembershipDate(), expectedUser.getMembershipDate());
    }

}