package com.project_name.step_definitions;
import com.project_name.pages.Documentation_Page;
import com.project_name.utilities.BrowserUtils;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Documentation_US101   {
    Documentation_Page docPage= new Documentation_Page();

    @Given("user is logged in the Odoo main page")
    public void user_is_logged_in_the_odoo_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        docPage.username.sendKeys(ConfigurationReader.getProperty("username")+ Keys.ENTER);
        docPage.password.sendKeys(ConfigurationReader.getProperty("password")+ Keys.ENTER);


        }

    @When("user should click on  POSManager in top right corner")
    public void userShouldClickOnPOSManagerInTopRightCorner() {

        docPage.POSManager.click();
    }

    @And("user should click on documentation button")
    public void userShouldClickOnDocumentationButton() {

        docPage.documentation.click();
    }
    @When("user should verify the “Odoo Documentation” message is displayed on a new window")
    public void user_should_verify_the_odoo_documentation_message_is_displayed_on_a_new_window() {


        //Driver.getDriver().get("https://www.odoo.com/documentation/16.0/");
       // System.out.println(Driver.getDriver().getTitle());

        Set<String> windows = Driver.getDriver().getWindowHandles();


        for(String handle : windows){
            Driver.getDriver().switchTo().window(handle);
            if(Driver.getDriver().getTitle().equals("Odoo Documentation — Odoo 16.0 documentation")){
                docPage.Oddo.isDisplayed();
            }




    }

        }

    @Then("user shouldn verify there are {int} main document topics are listed")
    public void userShouldnVerifyThereAreMainDocumentTopicsAreListed(int fourTopics) {

            Assert.assertEquals(fourTopics, docPage.elements.size());


    }
}



