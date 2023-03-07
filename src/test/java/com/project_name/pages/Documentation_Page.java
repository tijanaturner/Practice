package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Documentation_Page  {

    public Documentation_Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement POSManager;

    @FindBy(xpath = "//a[.='Documentation']")
    public WebElement documentation;


    @FindBy(xpath = "//h1[.='Odoo Documentation']")
    public WebElement Oddo;

    @FindBy(xpath = "//div[@id='o_content']//h2")
    public List<WebElement> elements;





}
