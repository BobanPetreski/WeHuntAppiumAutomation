Feature: Login form

  @SmokeTest
  Scenario: Login with valid credentials
   Given I open application
    When I tap og log in button
    Then I validate custom view
    Then I enter valid username and password
    Then I verify that login button is visible
    Then I tap on it