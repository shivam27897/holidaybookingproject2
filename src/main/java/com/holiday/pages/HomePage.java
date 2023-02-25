package com.holiday.pages;

import com.holiday.helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Helper {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='b-p'][text()='Accept']")
    WebElement acceptCookie;

    @FindBy(xpath = "/html/body/div[1]/main/section/div[1]/div/section/div/div[1]/div/article/section/div[1]/div/div/div[1]/div/input")
    WebElement destinationField;

    @FindBy(xpath = "")
    WebElement departureAirport;

    public void clickOnAccept(){
        clickOnElement(acceptCookie);
    }
    public void enterDestination(String text){
        sendTextToElement(destinationField,text);
    }
    public void enterDepartureAirport(String depart){
        sendTextToElement(departureAirport,depart);
    }
}
