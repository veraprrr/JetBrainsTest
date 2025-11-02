package com.example.jetbrainstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllIDEsPage {

    WebDriver driver;

    @FindBy(css = ".ch2-btn.ch2-allow-all-btn.ch2-btn-primary")
    private WebElement cookiesButton;

    @FindBy(xpath = "//button[@type='button' and @data-rs-internal='switcher__option']/span[text()='Business']")
    private WebElement businessButton;

    public void acceptCookies(){
        driver.get("https://www.jetbrains.com/ides/");
        cookiesButton.click();
    }

    public void clickBusinessButton(){
        businessButton.click();
    }

    public void compareUrl(){
        String compareUrl = "https://www.jetbrains.com/business/";
        System.out.println("В поисковой строке url: " + compareUrl);
        assertEquals(compareUrl, driver.getCurrentUrl());
    }

    public AllIDEsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}