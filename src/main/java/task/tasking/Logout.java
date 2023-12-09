package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class Logout {
    public static void as(WebDriver driver, String email, String password) {
        Login.as(driver, email, password);
        Click.on(driver, HomePageUI.logoutButton);
    }
}
