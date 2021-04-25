package definitions;

import io.cucumber.java8.En;
import pages.BookTickets;

public class BookTicketDefs implements En {
    BookTickets bookTickets = new BookTickets();
    public BookTicketDefs(){
        When("I book {string} ticket(s) with Depart date {string}, Departure from {string} Arrive at {string} and Seat Type {string}",
                (String ticketNumber, String depatureForm, String arriveAt, String seatType) -> {

        });
    }
}
