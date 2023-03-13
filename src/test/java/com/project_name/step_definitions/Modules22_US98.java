package com.project_name.step_definitions;

import com.project_name.pages.SalesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Modules22_US98 {

    SalesPage salesPage= new SalesPage();
    @Given("user is already logged in as a POS Manager")
    public void user_is_already_logged_in_as_a_pos_manager() {
        salesPage.login("posmanager16@info.com", "posmanager");
        Assert.assertTrue(salesPage.LoginNameButton.isDisplayed());

    }
    @Then("POS manager should verify there is {int} modules")
    public void pos_manager_should_verify_there_is_modules(Integer expected) {
        Assert.assertEquals(expected, Integer.valueOf(salesPage.modules22.size()));


    }

}
