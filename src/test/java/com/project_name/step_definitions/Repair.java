package com.project_name.step_definitions;

import com.project_name.pages.RepairsPage;
import com.project_name.pages.SalesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Repair {
SalesPage salesPage= new SalesPage();
RepairsPage repairs=new RepairsPage();
    @When("user clicks on the Repairs button as a POS manager")
    public void user_clicks_on_the_repairs_button_as_a_pos_manager() {

        salesPage.login("posmanager16@info.com", "posmanager");
        Assert.assertTrue(salesPage.LoginNameButton.isDisplayed());
        repairs.repaiButton.click();
    }

    @Then("user should be able to see {int} columns for the repairs orders as a POS manager")
    public void user_should_be_able_to_see_columns_for_the_repairs_orders_as_a_pos_manager(Integer int1) {
        Assert.assertEquals(int1, Integer.valueOf(repairs.repairsOrders.size()));

    }

    @When("user clicks on the Repairs button as a sales manager")
    public void user_clicks_on_the_repairs_button_as_a_sales_manager() {

        salesPage.login("salesmanager52@info.com", "salesmanager");
        Assert.assertTrue(salesPage.LoginNameButton.isDisplayed());
        repairs.repaiButton.click();
    }

    @Then("user should be able to see {int} columns for the repairs orders as a sales manager")
    public void user_should_be_able_to_see_columns_for_the_repairs_orders_as_a_sales_manager(Integer int1) {

        Assert.assertEquals(int1, Integer.valueOf(repairs.repairsOrders.size()));

    }

}
