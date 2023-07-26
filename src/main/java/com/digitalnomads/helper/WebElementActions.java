package com.digitalnomads.helper;

import com.digitalnomads.utils.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebElementActions {


    public WebElementActions input(WebElement element, String txt){
        waitElementToBeDisplayed(element);
        element.clear();
        element.sendKeys(txt);
        return this;
    }

    public WebElementActions press(WebElement element){
        waitElementToBeDisplayed(element);
        scrollToElement(element);
        element.click();
        return this;
    }

    public WebElementActions waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public WebElementActions waitElementToBeClickAble(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }
    public WebElementActions waitElementToBeDisplayedLocated(WebElement element,String locator){
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return this;
    }
    public WebElementActions pressDownAndEnter(WebElement element){
        element.sendKeys(Keys.DOWN,Keys.ENTER);
        return this;
    }
    public  void pause(int milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        }catch (InterruptedException e){
            System.out.println("error seconds");
        }
    }

    public WebElementActions pressUpAndEnter(WebElement element){
        waitElementToBeClickAble(element);
        element.sendKeys(Keys.UP,Keys.ENTER);
        return this;
    }

    public WebElementActions customAssertEquals(WebElement element, String str) {
        waitElementToBeDisplayed(element);
        Assert.assertEquals(element.getText(), str);
        return this;
    }
    public WebElementActions scrollDown() {
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, 250).perform();
        return this;
    }
    


    public WebElementActions pressJs(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", element);
        return this;
    }

    public Actions getActions() {
        return new Actions(Driver.getDriver());
    }

    public WebElementActions scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }
}