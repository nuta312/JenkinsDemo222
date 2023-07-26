package com.digitalnomads.pages;

import com.digitalnomads.helper.WebElementActions;
import com.digitalnomads.utils.drivers.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    WebElementActions elementActions = new WebElementActions();

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
