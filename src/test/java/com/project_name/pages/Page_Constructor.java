package com.project_name.pages;

import com.project_name.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Page_Constructor {

    public Page_Constructor(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


}
