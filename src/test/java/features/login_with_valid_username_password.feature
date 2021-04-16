Feature: Login Feature

    Background:
    Given I'm on login page
        When I get logged in with account from "<username>" with "<password>"
        Examples:
            | username                  | password |
            | phanthisen51195@gmail.com | 1233444  |
