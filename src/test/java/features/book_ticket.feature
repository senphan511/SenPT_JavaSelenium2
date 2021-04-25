Feature: Book Ticket

  Background:
    Given I navigate to Railway
    When I'm in Login Page

  Scenario Outline: Verify that the "Ticket booked successfully!" page displays correct information
    When I get logged in with account from "<username>" with "<password>"
    Examples:
      | username            | password |
      | a123@mailinator.com | 11111111 |
    Then System should display a label as "<label>"
    Examples:
      | label                       |
      | Welcome a123@mailinator.com |
    When I click on tab "<tab Name>"
    Examples:
      | tab Name    |
      | Book ticket |
    When I book "<ticket number>" ticket with Depart date "<departure date>", Departure from "<departure from>" Arrive at "<arrive at>" and Seat Type "<seat type>"
    Examples:
      | ticket number | departure date | departure from | arrive at  | seat type                      |
      | 1             | 5/1/2021       | Nha Trang      | Phan Thiết | Soft seat with air conditioner |
    Then System should display a label as "<label>"
    Examples:
      | label                       |
      | Ticket booked successfully! |
