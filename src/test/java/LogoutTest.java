import Helpers.helper.ScreenShotHelper;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.Logout;
import task.tasking.SingUp;
import task.validations.IsLogoutElement;

public class LogoutTest extends BaseTest {

    @Test
    public void logout() {
        Logout.as(webDriver, "juan+3@genso.com.bo", "asdf1234");
        Assert.assertFalse(IsLogoutElement.visible(webDriver));
        ScreenShotHelper.takeScreenShot(webDriver);
    }

}
