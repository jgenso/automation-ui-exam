package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class AddTodo {
    public static void as(WebDriver driver, String todoName) {
        Enter.text(driver, HomePageUI.todoTextButton, todoName);
        Click.on(driver, HomePageUI.todoTextField);
        ScreenShotHelper.takeScreenShot(driver);
    }
}
