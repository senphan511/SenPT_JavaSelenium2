package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private By userNameTextBox = By.xpath("//input[@id='username']");
    private By passwordTextBox = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//input[@value='Login'])");

    //contructor of this Page Object
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        this.setUserName(username);
        this.setPassword(password);
        this.clickLogin();
    }

    public void setUserName(String userName) {
        driver.findElement(userNameTextBox).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
