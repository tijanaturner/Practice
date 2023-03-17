package com.project_name.step_definitions;
import com.project_name.pages.Calendar_page;
import com.project_name.utilities.ConfigurationReader;
import com.project_name.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

public class Calendar_StepDefinitions {

    Calendar_page page = new Calendar_page();


    @Given("user is logged in")
    public void userIsAlreadyLoggedIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        page.username.sendKeys(ConfigurationReader.getProperty("username")+ Keys.ENTER);
        page.password.sendKeys(ConfigurationReader.getProperty("password")+ Keys.ENTER);


    }
    @And("user should click on Calendar page")
    public void userShouldClickOnCalendarPage() {
        page.calendarButton.click();

    }

    @Then("user should verify calendar time list starting from {string} til {string}, and is increased by one hour")
    public void userShouldVerifyCalendarTimeListStartingFromTilAndIsIncreasedByOneHour(String string1, String string2, List<String> time ) {
        List<String> textList = new ArrayList<String>();


        for (WebElement element : page.tables) {
            textList.add(element.getText());
        }

        Assert.assertEquals(string1,(textList.get(0)));
        Assert.assertEquals(string2,(textList.get(textList.size()-1)));
        Assert.assertEquals(time,textList);
    }



}



