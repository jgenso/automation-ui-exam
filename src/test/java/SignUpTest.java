import Helpers.helper.ScreenShotHelper;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.Logout;
import task.tasking.SingUp;
import task.validations.IsLogoutElement;

import java.util.UUID;

public class SignUpTest extends BaseTest {

    @Test
    public void signup() {
        String email = "juan+"+ UUID.randomUUID() + "@genso.com.bo";
        SingUp.as(webDriver, "Juan Olivera", "asdf1234", email);
        Assert.assertTrue(IsLogoutElement.visible(webDriver));
        ScreenShotHelper.takeScreenShot(webDriver);
    }

}
