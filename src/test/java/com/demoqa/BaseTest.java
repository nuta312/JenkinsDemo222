package com.demoqa;

import com.digitalnomads.helper.WebElementActions;
import com.digitalnomads.listeners.AllureReportListener;
import com.digitalnomads.pages.TextBoxPage;
import com.digitalnomads.utils.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners({AllureReportListener.class})
public  class BaseTest {


    public WebElementActions elementActions;
    public TextBoxPage textBoxPage;
    public WebDriver driver;

    @BeforeClass
    public void init(){
        elementActions = new WebElementActions();
        textBoxPage = new TextBoxPage();
        driver = Driver.getDriver();
    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }
}
