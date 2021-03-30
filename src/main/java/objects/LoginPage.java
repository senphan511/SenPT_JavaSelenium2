package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private By userNameTextBox = By.id("username");
    private By passwordTextBox = By.id("password");
    private By loginButton = By.id("login");

    //contructor of thif Page Object
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //this method allows you to log into your account provide that you have correct username and password
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
