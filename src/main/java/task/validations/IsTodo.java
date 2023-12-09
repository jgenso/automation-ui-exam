package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsTodo {
    public static boolean visible(WebDriver driver, String todoName) {
        By locator = By.xpath("//*[contains(text(),'" + todoName + "')]");
        return WaitUntilElement.isVisible(driver, locator);
    }
}
