package pages;

import common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPage {
    private static By userNameTextBox = By.xpath("//input[@id='username']");
    private static By passwordTextBox = By.xpath("//input[@id='password']");
    private static By loginButton = By.xpath("//input[@value='Login'])");
    private static By lblLoginErrorMsg = By.xpath("//p[@class = 'message error LoginForm']");
    private static By lblHeaderLoginPage = By.xpath("//div[@id='content']/h1");

    public static WebElement getTxtUserName()
    {
        return Constants.WEBDRIVER.findElement(userNameTextBox);
    }

    public static WebElement getTxtPassword()
    {
        return Constants.WEBDRIVER.findElement(passwordTextBox);
    }

    public static WebElement getBtnLogin() { return Constants.WEBDRIVER.findElement(loginButton); }

    public WebElement getlblLoginErrorMsg()
    {
        return Constants.WEBDRIVER.findElement(lblLoginErrorMsg);
    }

    public WebElement getlblHeaderLoginPage()
    {
        return Constants.WEBDRIVER.findElement(lblHeaderLoginPage);
    }

    public static void login(String username, String password){
        getTxtUserName().sendKeys(username);
        getTxtPassword().sendKeys(password);
        getBtnLogin().click();
    }

    public static void logout(){

    }

}