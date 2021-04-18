Feature: Login Feature

    Background:
        Given I navigate to Railway
        When I'm in Login Page
    Scenario Outline: Login with valid username and password
        When I get logged in with account from "<username>" with "<password>"
        Examples:
            | username                  | password |
            | phanthisen51195@gmail.com | 1233444  |
        Then System should display a label as "<label>"
        Examples:
            | label                             |
            | Welcome phanthisen51195@gmail.com |