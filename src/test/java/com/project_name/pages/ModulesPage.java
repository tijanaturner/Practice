package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ModulesPage {


    public ModulesPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement usernameLogin;

    @FindBy(id = "password")
    public WebElement passwordLogin;

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> modules;

    @FindBy(xpath = "//span[.='EventsCRMManager11']")
    public WebElement eventsCrmManager;
}

