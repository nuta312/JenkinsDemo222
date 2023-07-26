package com.demoqa.textBoxTests;

import com.demoqa.BaseTest;
import com.digitalnomads.data_factory.Object_Developer;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest {


    @Test
    @Description("Fill in the form with valid data")
    void fillInTheFormText(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillInTheForm(Object_Developer.createFakeTextBoxModel());
        Assert.assertTrue(true);
        elementActions.pause(5000);
        //TODO add some assertions
    }

    @Test
    @Description("Fill in the form with valid data")
    void fillInTheFormText1(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillInTheForm(Object_Developer.createFakeTextBoxModel());
        Assert.assertTrue(true);
        elementActions.pause(5000);
        //TODO add some assertions
    }

    @Test
    @Description("Fill in the form with valid data")
    void fillInTheFormText2(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillInTheForm(Object_Developer.createFakeTextBoxModel());
        Assert.assertTrue(true);
        elementActions.pause(5000);
        //TODO add some assertions
    }

    @Test
    @Description("Fill in the form with valid data")
    void fillInTheFormText3(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillInTheForm(Object_Developer.createFakeTextBoxModel());
        Assert.assertTrue(true);
        elementActions.pause(5000);
        //TODO add some assertions
    }

    @Test
    @Description("Fill in the form with valid data")
    void fillInTheFormText4(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillInTheForm(Object_Developer.createFakeTextBoxModel());
        Assert.assertTrue(true);
        elementActions.pause(5000);
        //TODO add some assertions
    }
}
