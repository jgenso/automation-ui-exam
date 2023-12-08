package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class SingUp {
    public static void as(WebDriver driver, String fullName, String password, String email) {
        Click.on(driver, HomePageUI.signUp);
        Enter.text(driver, HomePageUI.signUpFullName, fullName);
        Enter.text(driver, HomePageUI.signUpPassword, password);
        Enter.text(driver, HomePageUI.signUpEmail, email);
        Click.on(driver, HomePageUI.signUpCheckbox);
        Click.on(driver, HomePageUI.signUpSubmitButton);
    }
}
