Feature: Login

Scenario: Valid login
  Given user is on login page
  When user logs in with valid credentials
  Then inventory page is displayed
