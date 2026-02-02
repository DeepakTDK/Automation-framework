Feature: Inventory visibility

Scenario: Inventory items are visible
  Given user is on login page
  When user logs in with valid credentials
  Then all inventory items should be visible
