package com.project_name.step_definitions;

import com.project_name.pages.ModulesPage;
import com.project_name.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class Modules_US102 {

    ModulesPage modulePage = new ModulesPage();
    @Given("User is logged in page as a Event Manager")
    public void userIsLoggedInPageAsAEventManager() {

        modulePage.usernameLogin.sendKeys(ConfigurationReader.getProperty("eventscrm_username")+ Keys.ENTER);
        modulePage.passwordLogin.sendKeys(ConfigurationReader.getProperty("eventscrm_password")+ Keys.ENTER);
    }

    @When("verify user is logged in")
    public void verify_user_is_logged_in() {

      modulePage.eventsCrmManager.isDisplayed();

    }

    @Then("user should see {int} modules")
    public void user_should_see_modules(Integer allModules) {

            Assert.assertEquals(allModules, Integer.valueOf(modulePage.modules.size()));
        }


    }







