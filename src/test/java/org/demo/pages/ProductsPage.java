package org.demo.pages;

import org.demo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage {
    public ProductsPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    public WebElement SauceLabsBackpackAddToCart;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
    public WebElement SauceLabsFleeceJacketAddToCart;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
    public WebElement SauceLabsBoltT_ShirtAddToCart;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
    public WebElement SauceLabsOnesieAddToCart;

    @FindBy(className = "product_sort_container")
    public WebElement filter;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    public WebElement shoppingCartContainer;




}