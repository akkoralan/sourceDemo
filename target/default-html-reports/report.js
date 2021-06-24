$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/shopping.feature");
formatter.feature({
  "name": "Shopping feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to shopping online",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShoppingStepDef.user_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sort the items lowest price",
  "keyword": "When "
});
formatter.match({
  "location": "ShoppingStepDef.user_sort_the_items_lowest_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add 4 items to the shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingStepDef.user_add_items_to_the_shopping_cart(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  visit the shoping cart to see the items has been added",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingStepDef.user_visit_the_shoping_cart_to_see_the_items_has_been_added()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user remove an item and add another item",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingStepDef.user_remove_an_item_and_add_another_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user go to checkout and finish checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingStepDef.user_go_to_checkout_and_finish_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});