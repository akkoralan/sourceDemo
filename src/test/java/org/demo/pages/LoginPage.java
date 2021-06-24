package org.demo.pages;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.demo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "user-name")
    public WebElement Username;

    @FindBy(id = "password")
    public WebElement Password;

    @FindBy(id ="login-button")
    public WebElement LOGIN;

    public void login (String userName,String password){
        Username.sendKeys(userName);
        Password.sendKeys(password);
        LOGIN.click();
    }
}
