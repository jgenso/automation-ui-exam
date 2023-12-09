package task.tasking;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class AddProject {
    public static void as(WebDriver driver, String projectName) {
        Click.on(driver, HomePageUI.addProject);
        WaitUntilElement.isVisible(driver, HomePageUI.addProjectTextField);
        Enter.text(driver, HomePageUI.addProjectTextField, projectName);
        Click.on(driver, HomePageUI.addProjectButton);
    }
}
