package pages;

import common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends GeneralPage {
    private By emailtxt = By.xpath("//input[@id= 'email']");
    private By passwordtxt = By.xpath("//input[@id= 'password']");
    private By confirmtxt = By.xpath("//input[@id= 'confirmPassword']");
    private By pIDtxt = By.xpath("//input[@id= 'pid']");
    private By registerBtn = By.xpath("//input[@value='Register']");
    private By errormessage = By.xpath("//div[@id='content']//p[@class='message error']");

    public WebElement getEmailtxt(){
        return Constants.WEBDRIVER.findElement(emailtxt);
    }

    public WebElement getPasswordtxt(){
        return Constants.WEBDRIVER.findElement(passwordtxt);
    }

    public WebElement getConfirmPasswordtxt(){
        return Constants.WEBDRIVER.findElement(confirmtxt);
    }

    public WebElement getPIDtxt(){
        return Constants.WEBDRIVER.findElement(pIDtxt);
    }

    public WebElement getRegisterBtn(){
        return Constants.WEBDRIVER.findElement(pIDtxt);
    }

    public WebElement getErrorMessage(){
        return Constants.WEBDRIVER.findElement(errormessage);
    }

    public void Register(String email, String password, String confirmpassword, String pID){
        getEmailtxt().sendKeys(email);
        getPasswordtxt().sendKeys(password);
        getConfirmPasswordtxt().sendKeys(confirmpassword);
        getPIDtxt().sendKeys(pID);
        getRegisterBtn().click();
    }


}
