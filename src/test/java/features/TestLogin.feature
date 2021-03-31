Feature: Login

    Background:
        Given user on the homepage
        And user follows "Sign in"

        Scenario: Create a New User
            When user fills "registration email textbox" with "phanthisen51195@gmail.com"