package com.project_name.step_definitions;

import com.project_name.pages.Modul12Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Modules16_US99 {

    Modul12Page modul12Page = new Modul12Page();
    @Given("user is already logged in as a Inventory Manager")
    public void user_is_already_logged_in_as_a_inventory_manager() {
       modul12Page.login("imm10@info.com", "inventorymanager");
        Assert.assertTrue(modul12Page.LoginNameButton.isDisplayed());
    }
    @Then("Inventory manager should verify there is {int} modules")
    public void inventory_manager_should_verify_there_is_modules(Integer expected) {

        Assert.assertEquals(expected, Integer.valueOf(modul12Page.modulesList.size()));

    }


}
