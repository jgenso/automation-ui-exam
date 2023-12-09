import Helpers.helper.ScreenShotHelper;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.Logout;
import task.tasking.SingUp;
import task.validations.IsLogoutElement;

public class SignUpTest extends BaseTest {

    @Test
    public void signup() {
        SingUp.as(webDriver, "Juan Olivera", "asdf1234", "juan+4@genso.com.bo");
        Assert.assertTrue(IsLogoutElement.visible(webDriver));
        ScreenShotHelper.takeScreenShot(webDriver);
    }

}
