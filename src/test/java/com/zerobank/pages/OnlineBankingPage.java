package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OnlineBankingPage {

    public OnlineBankingPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "online-banking")
    public WebElement onlineBanking;



    @FindBy(xpath = "//a[.='Savings']")
    public WebElement SavingsLink;

    @FindBy(css = "select[name='accountId']")
    public WebElement dropDown;


public void NavigateTabs(String tabName){

    WebElement tabs=Driver.get().findElement(By.xpath("//a[.='"+tabName+"']"));

}

    public boolean IsSelected(String options) {
        WebElement option = Driver.get().findElement(By.xpath("//select/option[.='" + options + "']"));
        return option.isSelected();
    }

    public void Select(String select) {

        Select selecting = new Select(dropDown);
        selecting.selectByVisibleText(select);
    }

    public void clickLink(String linkName) {

        WebElement link = Driver.get().findElement(By.xpath("//span[.='" + linkName + "']"));
       link.click();
    }

    public void NavigateLinks(String LinkName) {

        WebElement links= Driver.get().findElement(By.xpath("//span[.='"+LinkName+"']"));
        links.click();
    }

    public void clickOnlineBanking() {

        onlineBanking.click();
    }
}

