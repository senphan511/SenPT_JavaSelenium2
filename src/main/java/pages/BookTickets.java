package pages;
import common.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class BookTickets extends GeneralPage{
    public WebElement getDepartDate() {
        return Constants.WEBDRIVER.findElement(By.xpath("//select[@name = 'Date']"));
    }

    public WebElement getDepartFrom() {
        return Constants.WEBDRIVER.findElement(By.xpath("//select[@name = 'DepartStation']"));
    }

    public WebElement getArriveAt() {
        return Constants.WEBDRIVER.findElement(By.xpath("//select[@name = 'ArriveStation']"));
    }

    public WebElement getSeatType() {
        return Constants.WEBDRIVER.findElement(By.xpath("//select[@name = 'SeatType']"));
    }

    public WebElement getTicketAmount() {
        return Constants.WEBDRIVER.findElement(By.xpath("//select[@name = 'TicketAmount']"));
    }

    public WebElement getBtnBookTicket() {
        return Constants.WEBDRIVER.findElement(By.xpath("//input[@value = 'Book ticket']"));
    }

    public WebElement getlblMesBookTicket() {
        return Constants.WEBDRIVER.findElement(By.xpath("//div[@id = 'content']/h1"));
    }

    public void bookTicket(String departDate, String departFrom, String arriveAt, String seatType, String ticketAmount) {
        this.getDepartDate().sendKeys(departDate);
        this.getDepartFrom().sendKeys(departFrom);
        this.getArriveAt().sendKeys(arriveAt);
        this.getSeatType().sendKeys(seatType);
        this.getTicketAmount().sendKeys(ticketAmount);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.getBtnBookTicket().click();
    }
}
