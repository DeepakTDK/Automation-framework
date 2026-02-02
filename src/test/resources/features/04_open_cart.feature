Feature: Open cart

Scenario: User opens cart
  Given user is on login page
  When user logs in with valid credentials
  And user navigates to cart
  Then cart page is displayed
