package com.project_name.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Modul12Page extends BasePage {

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement LoginNameButton;


    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> modulesList;






}
