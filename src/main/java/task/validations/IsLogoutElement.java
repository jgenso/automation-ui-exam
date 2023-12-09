package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class IsLogoutElement {
    public static boolean visible(WebDriver driver) {
        return WaitUntilElement.isVisible(driver, HomePageUI.logoutButton);
    }
}
