Feature: Register account

    Background:
        Given I navigate to Railway

    Scenario Outline: Verify that user can open the Register page
        When I click on tab "<tab Name>"
        Examples:
            | tab Name |
            | Register |
        Then System should display page header as "<page header>"
        Examples:
            | page header    |
            | Create account |

    Scenario Outline: Verify that user cannot create new account using Email that has been registered
        When I click on tab "<tab Name>"
        Examples:
            | tab Name |
            | Register |
        When I register with email "<email>", password "<password>", confirm password "<confirmpass>" and pID "<pID>"
        Examples:
            | email            | password | confirmpass | pID      |
            | duyduy@gmail.com | 11111111 | 11111111    | 11111111 |
        Then System should display an error message "<message>"
        Examples:
            | message                               |
            | This email address is already in use. |