package com.project_name.step_definitions;

import com.project_name.pages.LoginPage;
import com.project_name.pages.SalesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SalesPage_US96 {
    SalesPage   salesPage = new SalesPage();

    @Given("they are logged in with valid {string} and {string}")
    public void theyAreLoggedInWithValidAnd(String username, String password) {
        salesPage.login(username, password);
    }

    @And("user should verify logged in as an {string}")
    public void userShouldVerifyLoggedInAsAn(String expected) {
        Assert.assertEquals(expected, salesPage.LoginNameButton.getText());
    }

    @When("they navigate and click to the Sales page")
    public void theyNavigateAndClickToTheSalesPage() {
        salesPage.sales.click();

    }

    @Then("they should verify {int} columns are displayed")
    public void theyShouldVerifyColumnsAreDisplayed(int expColumns) {
        Assert.assertEquals(expColumns,salesPage.columns.size());

    }


}
