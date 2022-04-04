package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "signin_button")
    public WebElement signinBtn;

    @FindBy(id = "user_login")
    public WebElement username;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(css = "input[name='submit']")
    public WebElement loginBtn;

    //Secure pop up button
    @FindBy(id = "details-button")
    public WebElement advancedBtn;

    //Continue unsafe link
    @FindBy(id = "proceed-link")
    public WebElement hideAdvancedBtn;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement LoginErrorMessage;


    public void HandlePopUp() {

        advancedBtn.click();
        hideAdvancedBtn.click();
    }

    public void login() {

        signinBtn.click();
        username.sendKeys(ConfigurationReader.get("Username"));
        password.sendKeys(ConfigurationReader.get("Password"));
        loginBtn.click();
    }

    public void InvalidLogin() {
        signinBtn.click();
        username.sendKeys(ConfigurationReader.get("InvalidUsername"));
        password.sendKeys(ConfigurationReader.get("InvalidPassword"));
        loginBtn.click();
    }

}
