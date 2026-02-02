Feature: Cart navigation

Scenario: Navigate to cart
  Given user is on login page
  When user logs in with valid credentials
  And user navigates to cart
  Then cart page is displayed
