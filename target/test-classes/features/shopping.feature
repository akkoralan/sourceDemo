
Feature: Shopping feature
  @wip
  Scenario: User should be able to shopping online
Given user on the login page
When user sort the items lowest price
And  user add 4 items to the shopping cart
Then user  visit the shoping cart to see the items has been added
Then  user remove an item and add another item
Then  user go to checkout and finish checkout