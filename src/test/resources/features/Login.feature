
@Login
Feature: Login functionality
  Scenario: Login with valid credentials
    Given The user in the login page
    When The user enters valid username and password
    Then The user should be able to see "Account Summary" page

    Scenario: Login with invalid credentials
      Given The user in the login page
      When The user enters invalid username and password
      Then The user should see  "Login and/or password are wrong." error message


