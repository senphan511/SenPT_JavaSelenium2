package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPage {
    private By userNameTextBox = By.xpath("//input[@id='username']");
    private By passwordTextBox = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//input[@value='Login'])");
    private By lblLoginErrorMsg = By.xpath("//p[@class = 'message error LoginForm']");
    private By lblHeaderLoginPage = By.xpath("//div[@id='content']/h1");

    public WebElement getTxtUserName()
    {
        return Constant.WEBDRIVER.findElement(userNameTextBox);
    }

    public WebElement getTxtPassword()
    {
        return Constant.WEBDRIVER.findElement(passwordTextBox);
    }

    public WebElement getBtnLogin() { return Constant.WEBDRIVER.findElement(loginButton); }

    public WebElement getlblLoginErrorMsg()
    {
        return Constant.WEBDRIVER.findElement(lblLoginErrorMsg);
    }

    public WebElement getlblHeaderLoginPage()
    {
        return Constant.WEBDRIVER.findElement(lblHeaderLoginPage);
    }

    public HomePage login(String username, String password)
    {
        JavascriptExecutor jse = (JavascriptExecutor) Constant.WEBDRIVER;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");

        this.getTxtUserName().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();

        return new HomePage();
    }
}