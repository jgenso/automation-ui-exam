package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class AddTodo {
    public static void as(WebDriver driver, String todoName) {
        Enter.text(driver, HomePageUI.todoTextField, todoName);
        Click.on(driver, HomePageUI.todoTextButton);
        ScreenShotHelper.takeScreenShot(driver);
    }
}
