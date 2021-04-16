package pages;

import common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage {
    protected WebElement getTablLogin(){
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href = '/Account/Login.cshtml']"));
    }

    protected WebElement getTabLogout(){
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href= '/Account/Logout']"));
    }

    public WebElement getlblWelcomeMessage(){
        return Constants.WEBDRIVER.findElement(By.xpath("//div[@class='account']/strong"));
    }

    protected WebElement getllblBlankUsernameMsg(){
        return Constants.WEBDRIVER.findElement(By.xpath("//p[@class = 'message error LoginForm']"));
    }

    protected WebElement getMsgPID(){
        return Constants.WEBDRIVER.findElement(By.xpath("//li[@class = 'pid-number']/label[@class = 'validation-error']"));
    }

    protected WebElement getTabRegister(){
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href= '/Account/Register.cshtml']"));
    }

    protected WebElement getlblregisterMessage(){
        return Constants.WEBDRIVER.findElement(By.xpath("//div[@id = 'content']//p[@class = 'message error']"));
    }

    protected WebElement getTabChangePassword(){
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href = '/Account/ChangePassword.cshtml']"));
    }

    protected WebElement getlblMesPassRegister(){
        return Constants.WEBDRIVER.findElement(By.xpath("//li[@class = 'password']//label[@class= 'validation-error']"));
    }

    protected  WebElement getTabBookTicket()
    {
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href='/Page/BookTicketPage.cshtml']"));
    }

    protected WebElement gettabTimeTable()
    {
        return Constants.WEBDRIVER.findElement(By.xpath("//div[@id='menu']//a[@href= 'TrainTimeListPage.cshtml']"));
    }

    protected WebElement gettabMyTicket()
    {
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href = '/Page/ManageTicket.cshtml']"));
    }

    protected WebElement getlblRegisterSucess(){
        return Constants.WEBDRIVER.findElement(By.xpath("//div[@id = 'content']"));
    }

    protected WebElement getFormBookTicket(){
        return Constants.WEBDRIVER.findElement(By.xpath("//form[@method = 'post']"));
    }

    protected WebElement getTabContact(){
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href='/Page/Contact.cshtml']"));
    }

    protected WebElement getlblHomeHeader(){
        return Constants.WEBDRIVER.findElement(By.xpath("//div[@id='content']//h1"));
    }

    protected WebElement getlblTextLogout(){
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href= '/Account/Logout']//span"));
    }
    //Methods
    public String getRegisterSucess(){
        return this.getlblRegisterSucess().getText();
    }
    public String getWelcomeMessage(){
        return this.getlblWelcomeMessage().getText();
    }
    public String getMessageRegister(){
        return this.getlblregisterMessage().getText();
    }
    public String getMesPassRgister(){
        return this.getlblMesPassRegister().getText();
    }
    public String getTextLogoutTab() {return  this.getlblTextLogout().getText();}

    public String getBlankUserNameMsg(){
        return this.getllblBlankUsernameMsg().getText();
    }
    public String getMsgPid(){
        return this.getMsgPID().getText();
    }
    public String getHomePageHeader(){ return  this.getlblHomeHeader().getText();}

}