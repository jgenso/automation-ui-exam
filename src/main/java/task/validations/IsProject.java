package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.HomePageUI;

import java.util.List;

public class IsProject {
    public static boolean visible(WebDriver driver, String projectName) {
        By locator = By.xpath("//*[contains(text(),'" + projectName + "')]");
        return WaitUntilElement.isVisible(driver, locator);
    }
}
