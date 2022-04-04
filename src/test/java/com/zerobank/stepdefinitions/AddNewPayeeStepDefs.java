package com.zerobank.stepdefinitions;

import com.zerobank.pages.AddNewPayeePage;
import com.zerobank.pages.OnlineBankingPage;
import io.cucumber.java.en.*;

public class AddNewPayeeStepDefs {

    @Given("Add New payee tab")
    public void add_New_payee_tab() {
       new AddNewPayeePage().navigateAddNewPayee();

    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Then("message {string} shold be displayed")
    public void message_shold_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
