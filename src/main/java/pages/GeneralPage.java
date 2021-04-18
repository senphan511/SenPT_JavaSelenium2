package pages;

import common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage {
    public void getTablLogin(){
        Constants.WEBDRIVER.findElement(By.xpath("//a[@href = '/Account/Login.cshtml']"));
    }
    public WebElement getHeaderPage(){
       return Constants.WEBDRIVER.findElement(By.xpath("//div/h1"));
    }
    public WebElement getTabLogout(){
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href= '/Account/Logout']"));
    }

    public WebElement getlblWelcomeMessage(){
        return Constants.WEBDRIVER.findElement(By.xpath("//div[@class='account']/strong"));
    }

    public WebElement getllblBlankUsernameMsg(){
        return Constants.WEBDRIVER.findElement(By.xpath("//p[@class = 'message error LoginForm']"));
    }

    public WebElement getMsgPID(){
        return Constants.WEBDRIVER.findElement(By.xpath("//li[@class = 'pid-number']/label[@class = 'validation-error']"));
    }

    public WebElement getTabRegister(){
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href= '/Account/Register.cshtml']"));
    }

    public WebElement getlblregisterMessage(){
        return Constants.WEBDRIVER.findElement(By.xpath("//div[@id = 'content']//p[@class = 'message error']"));
    }

    public WebElement getTabChangePassword(){
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href = '/Account/ChangePassword.cshtml']"));
    }

    public WebElement getlblMesPassRegister(){
        return Constants.WEBDRIVER.findElement(By.xpath("//li[@class = 'password']//label[@class= 'validation-error']"));
    }

    public  WebElement getTabBookTicket()
    {
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href='/Page/BookTicketPage.cshtml']"));
    }

    public WebElement gettabTimeTable()
    {
        return Constants.WEBDRIVER.findElement(By.xpath("//div[@id='menu']//a[@href= 'TrainTimeListPage.cshtml']"));
    }

    public WebElement gettabMyTicket()
    {
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href = '/Page/ManageTicket.cshtml']"));
    }

    public WebElement getlblRegisterSucess(){
        return Constants.WEBDRIVER.findElement(By.xpath("//div[@id = 'content']"));
    }

    public WebElement getFormBookTicket(){
        return Constants.WEBDRIVER.findElement(By.xpath("//form[@method = 'post']"));
    }

    public WebElement getTabContact(){
        return Constants.WEBDRIVER.findElement(By.xpath("//a[@href='/Page/Contact.cshtml']"));
    }

    public WebElement getlblHomeHeader(){
        return Constants.WEBDRIVER.findElement(By.xpath("//div[@id='content']//h1"));
    }

    public WebElement getlblTextLogout(){
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