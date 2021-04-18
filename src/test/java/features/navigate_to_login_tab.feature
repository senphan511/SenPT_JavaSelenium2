Feature: User can navigate to Login tab

  Background:
    Given I navigate to Railway
    When I'm in Login Page
  Scenario Outline: Verify that user can open the Login page
    Then System should display page header as "<page header>"
    Examples:
      | page header |
      | Login Page  |

  Scenario Outline: Verify that clicking on the hyperlink text "registration page" will redirect to the Register page
    When I click on hyperlink "<link>"
    Then System should display page header as "<page header>"
    Examples:
      | page header    | link              |
      | Create account | Registration Page |



