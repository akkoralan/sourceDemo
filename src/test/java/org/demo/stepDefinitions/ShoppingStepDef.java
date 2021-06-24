package org.demo.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.demo.pages.*;
import org.demo.utilities.BrowserSetup;
import org.demo.utilities.ConfigurationReader;
import org.demo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ShoppingStepDef {

    LoginPage loginPage= new LoginPage();
    ProductsPage productsPage = new ProductsPage();
    YourCartPage yourCartPage=new YourCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        BrowserSetup.waitFor(2);
        loginPage.login(ConfigurationReader.get("Username"),ConfigurationReader.get("Password"));
        BrowserSetup.waitFor(3);
    }

    @When("user sort the items lowest price")
    public void user_sort_the_items_lowest_price() {
        WebElement filterOption = productsPage.filter;
        BrowserSetup.waitFor(2);

        Select filterOptions = new Select(filterOption);
        filterOptions.selectByValue("lohi");
        BrowserSetup.waitFor(2);

        String expectedOption = "Price (low to high)";
        String actualOption = filterOptions.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedOption,actualOption);

    }

    @When("user add {int} items to the shopping cart")
    public void user_add_items_to_the_shopping_cart(Integer itemsNumber) {
        productsPage.SauceLabsBackpackAddToCart.click();
        productsPage.SauceLabsFleeceJacketAddToCart.click();
        productsPage.SauceLabsBoltT_ShirtAddToCart.click();
        productsPage.SauceLabsOnesieAddToCart.click();

        BrowserSetup.waitFor(3);
        System.out.println(productsPage.shoppingCartContainer.getText());
        String expectedItems = itemsNumber.toString();
        System.out.println(expectedItems);
        String actualItems = productsPage.shoppingCartContainer.getText();
        Assert.assertEquals(expectedItems,actualItems);

    }



    @Then("user  visit the shoping cart to see the items has been added")
    public void user_visit_the_shoping_cart_to_see_the_items_has_been_added() {
        productsPage.shoppingCartContainer.click();


    }

    @Then("user remove an item and add another item")
    public void user_remove_an_item_and_add_another_item() {

    }

    @Then("user go to checkout and finish checkout")
    public void user_go_to_checkout_and_finish_checkout() {

    }
}
