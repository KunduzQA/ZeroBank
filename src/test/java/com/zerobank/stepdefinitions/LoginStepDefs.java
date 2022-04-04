package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {


    @Given("The user in the login page")
    public void the_user_in_the_login_page() {
        String url = ConfigurationReader.get("url");

        Driver.get().get(url);


    }

    @When("The user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        LoginPage loginPage=new LoginPage();

        loginPage.login();
        new LoginPage().HandlePopUp();
    }

    @Then("The user should be able to see {string} page")
    public void the_user_should_be_able_to_see_page(String expectedPage) {

        Assert.assertTrue(Driver.get().getTitle().contains(expectedPage));

    }

    @When("The user enters invalid username and password")
    public void the_user_enters_invalid_username_and_password() {

        new LoginPage().InvalidLogin();
    }

    @Then("The user should see  {string} error message")
    public void the_user_should_see_error_message(String expectedMessage) {
   String actualMessage=new LoginPage().LoginErrorMessage.getText();

   Assert.assertEquals(expectedMessage,actualMessage);
    }


}
