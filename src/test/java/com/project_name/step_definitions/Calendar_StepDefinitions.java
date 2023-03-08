package com.project_name.step_definitions;
import com.project_name.pages.Calendar_page;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

public class Calendar_StepDefinitions {

    Calendar_page page = new Calendar_page();

    @Given("user is on the login page of the Oddo app")
    public void user_is_on_the_login_page_of_the_oddo_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user enters username")
    public void user_enters_username() {
        page.username.sendKeys(ConfigurationReader.getProperty("username"));

    }

    @When("user enters password")
    public void user_enters_password() {
        page.password.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);


    }

    @When("user should see the Discuss page")
    public void user_should_see_the_discuss_page() {
        page.discuss.isDisplayed();


    }

    @Then("user should click on Calendar page")
    public void user_should_click_on_calendar_page() {
        page.calendarButton.click();

    }


    @Then("user should see the time list displays, increased by one hour each time")
    public void userShouldSeeTheTimeListDisplaysInceaseByOneHourEachTime(List<String> time) {
        List<String> textList = new ArrayList<String>();


        for (WebElement element : page.tables) {
            textList.add(element.getText());
        }

        Assert.assertEquals(time,textList);
        Assert.assertEquals(time.get(0),(textList.get(0)));
        Assert.assertEquals(time.get(time.size()-1),(textList.get(textList.size()-1)));

    }
    }

