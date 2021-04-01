Feature: Login

    Background:
        Given I'm navigating to RailWay website
        And user follows "Sign in"

        Scenario: Create a New User
            When user fills "registration email textbox" with "phanthisen51195@gmail.com"