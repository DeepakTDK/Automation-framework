Feature: Add to cart

Scenario: User adds product to cart
  Given user is on login page
  When user logs in with valid credentials
  And user adds product to cart
  Then inventory page is displayed
