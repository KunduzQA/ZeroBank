package com.zerobank.pages;

import org.junit.FixMethodOrder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewPayeePage extends OnlineBankingPage{

    @FindBy(xpath = "//a[.='Add New Payee']")
   public  WebElement AddNewPayee;

    public void navigateAddNewPayee(){

        clickOnlineBanking();
      NavigateLinks("Pay Bills");
        AddNewPayee.click();

    }
}
