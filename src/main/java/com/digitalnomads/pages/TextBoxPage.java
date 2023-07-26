package com.digitalnomads.pages;

import com.digitalnomads.models.TextBoxModel;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage{

    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id = "submit1")
    public WebElement submitBtn;

    @Step("Fill In the Text box form with mock data")
    public TextBoxPage fillInTheForm(TextBoxModel textBoxModel){

        elementActions.input(fullNameInput, textBoxModel.getUserName())
                .input(emailInput, textBoxModel.getEmail())
                .input(currentAddressInput, textBoxModel.getCurrentAddress())
                .input(permanentAddressInput, textBoxModel.getPermanentAddress())
                .press(submitBtn);
        return this;
    }
}
