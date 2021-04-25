package pages;
import common.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class BookTickets extends GeneralPage{
    private By getDepartStation = By.xpath("//table//tr[@class='OddRow']//td[count(//table/tbody/tr/th[.=\"Depart Station\"]/preceding-sibling::th)+1]");
    private By getarriveStation = By.xpath("//table//tr[@class='OddRow']//td[count(//table/tbody/tr/th[.=\"Arrive Station\"]/preceding-sibling::th)+1]");
    private By getSeatType = By.xpath("//table//tr[@class='OddRow']//td[count(//table/tbody/tr/th[.=\"Seat Type\"]/preceding-sibling::th)+1]");
    private By getDepartureDate = By.xpath("//table//tr[@class='OddRow']//td[count(//table/tbody/tr/th[.=\"Depart Date\"]/preceding-sibling::th)+1]");
    private By getBookDate = By.xpath("//table//tr[@class='OddRow']//td[count(//table/tbody/tr/th[.=\"Book Date\"]/preceding-sibling::th)+1]");
    private By getAmount = By.xpath("//table//tr[@class='OddRow']//td[count(//table/tbody/tr/th[.=\"Amount\"]/preceding-sibling::th)+1]");
    private By dateCbx = By.xpath("//select[@name = 'Date']");
    private By departureStationCbx = By.xpath("//select[@name = 'DepartStation']");
    private By arriveStationCbx = By.xpath("//select[@name = 'ArriveStation']");
    private By setTypeCbb = By.xpath("//select[@name = 'SeatType']");
    private By ticketAmountTxt = By.xpath("//select[@name = 'TicketAmount']");
    private By bookTicketBtn = By.xpath("//input[@value = 'Book ticket']");

    public WebElement getDepartDateCbb() {
        return Constants.WEBDRIVER.findElement(dateCbx);
    }
    public WebElement getDepartFromCbb() {
        return Constants.WEBDRIVER.findElement(departureStationCbx);
    }

    public WebElement getArriveAtCbb() {
        return Constants.WEBDRIVER.findElement(arriveStationCbx);
    }

    public WebElement getSeatTypeCbb() {
        return Constants.WEBDRIVER.findElement(setTypeCbb);
    }

    public WebElement getTicketAmountTxt() {
        return Constants.WEBDRIVER.findElement(ticketAmountTxt);
    }

    public WebElement getBtnBookTicket() {
        return Constants.WEBDRIVER.findElement(bookTicketBtn);
    }

    public void bookTicket(String departDate, String departFrom, String arriveAt, String seatType, String ticketAmount) {
        this.getDepartDateCbb().sendKeys(departDate);
        this.getDepartFromCbb().sendKeys(departFrom);
        this.getArriveAtCbb().sendKeys(arriveAt);
        this.getSeatTypeCbb().sendKeys(seatType);
        this.getTicketAmountTxt().sendKeys(ticketAmount);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.getBtnBookTicket().click();
    }
    public List<String> getBookedTickets(){
        List<String> bookedTicketsList = new ArrayList<>();
        bookedTicketsList.add(getDepartStation.toString());
        bookedTicketsList.add(getarriveStation.toString());
        bookedTicketsList.add(getSeatType.toString());
        bookedTicketsList.add(getDepartureDate.toString());
        bookedTicketsList.add(getBookDate.toString());
        bookedTicketsList.add(getAmount.toString());
        return  bookedTicketsList;
    }
    public List<String> getTickets(){
        List<String> ticketsList = new ArrayList<>();
        ticketsList.add(getDepartDateCbb().toString());
        ticketsList.add(getArriveAtCbb().toString());
        ticketsList.add(getSeatTypeCbb().toString());
        ticketsList.add(getDepartDateCbb().toString());
        ticketsList.add(getTicketAmountTxt().toString());
        return  ticketsList;
    }
}
