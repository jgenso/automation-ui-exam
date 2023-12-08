package ui;

import org.openqa.selenium.By;

public class HomePageUI {
    public static By signUp = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[3]/a");

    public static By signUpFullName = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]");

    public static By signUpEmail = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]");

    public static By signUpPassword = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]");

    public static By signUpCheckbox = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_CheckBoxTerms\"]");

    public static By signUpSubmitButton = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]");
}
