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


