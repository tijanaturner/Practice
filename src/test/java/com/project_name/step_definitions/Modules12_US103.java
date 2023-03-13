package com.project_name.step_definitions;

import com.project_name.pages.Modul12Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Modules12_US103 {


    Modul12Page modul12Page= new Modul12Page();



    @Given("user is already logged in as a Expenses Manager")
    public void user_is_already_logged_in_as_a_expenses_manager() {
    modul12Page.login("expensesmanager10@info.com", "expensesmanager");
    Assert.assertTrue(modul12Page.LoginNameButton.isDisplayed());

    }
    @Then("Expenses manager should verify there is {int} modules")
    public void expenses_manager_should_verify_there_is_modules(Integer expected) {

        Assert.assertEquals(expected, Integer.valueOf(modul12Page.modulesList.size()));


    }


}
