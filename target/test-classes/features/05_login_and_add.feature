
Feature: UI Test

  Scenario: UI scenario
    Given user is on login page
    When user logs in with valid credentials
    Then inventory page is displayed
