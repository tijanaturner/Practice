package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Calendar_page {

    public Calendar_page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//a[@data-action-id='120']")
    public WebElement discuss;

    @FindBy(xpath = "//a[@data-action-id='136']")
    public WebElement calendarButton;

    @FindBy(xpath = "//div[@class='fc-slats']//tbody//tr//span")
    public List<WebElement> tables;



}
