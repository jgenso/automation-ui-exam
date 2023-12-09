import Helpers.helper.ScreenShotHelper;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddProject;
import task.tasking.Login;
import task.tasking.Logout;
import task.tasking.SingUp;
import task.validations.IsLogoutElement;

import java.util.UUID;

public class LoginTest extends BaseTest {


    @Test
    public void login() {
        Login.as(webDriver, "juan+3@genso.com.bo", "asdf1234");
        Assert.assertTrue(IsLogoutElement.visible(webDriver));
        ScreenShotHelper.takeScreenShot(webDriver);
    }

    @Test
    public void addProject() {
        String projectName = "project_" + UUID.randomUUID();
        Login.as(webDriver, "juan+3@genso.com.bo", "asdf1234");
        AddProject.as(webDriver, projectName);
        ScreenShotHelper.takeScreenShot(webDriver);
    }

}
