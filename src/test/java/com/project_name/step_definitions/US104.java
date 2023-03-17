package com.project_name.step_definitions;

import com.project_name.pages.SalesManagerPage;
import com.project_name.pages.SalesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US104 {

    SalesManagerPage sales_Manager_Page = new SalesManagerPage();
    SalesPage salesPage= new SalesPage();

    @Given("verify user is logged as sales manager")
    public void verifyUserIsLoggedAsSalesManager() {
        salesPage.login("salesmanager15@info.com", "salesmanager");
        Assert.assertTrue(salesPage.LoginNameButton.isDisplayed());

    }

    @Then("verify the sales manager has access to {int} modules")
    public void verify_the_sales_manager_has_access_to_modules(Integer expectedNumberOfModules) {

        Assert.assertEquals(expectedNumberOfModules, Integer.valueOf(sales_Manager_Page.mainModules.size()));

    }
}


