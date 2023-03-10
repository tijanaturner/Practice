package com.project_name.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SalesPage extends BasePage{




    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement sales;

    @FindBy(css = "th[class*='o_column_sortable']")
    public List<WebElement> columns;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement LoginNameButton;











}
