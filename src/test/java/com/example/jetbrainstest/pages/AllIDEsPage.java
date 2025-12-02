package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllIDEsPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(AllIDEsPage.class));

    WebDriver driver;

    @FindBy(css = ".ch2-btn.ch2-allow-all-btn.ch2-btn-primary")
    private WebElement cookiesButton;

    @FindBy(xpath = "//button[@type='button' and @data-rs-internal='switcher__option']/span[text()='Business']")
    private WebElement businessButton;

    @FindBy(css = "._rs-link_tfgi0h_1._rs-link_mode_standalone_tfgi0h_1._rs-typography_theme_dark_tfgi0h_1")
    private WebElement exploreOffersLink;

    @FindBy(css = "a._rs-link_tfgi0h_1[href='/startups/#startup-program']")
    private WebElement learnMoreLink;

    public AllIDEsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptCookies() {
        driver.get("https://www.jetbrains.com/ides/");
        cookiesButton.click();
        LOG.info("Принимаем куки");
    }

    public void clickBusinessButton() {
        driver.get("https://www.jetbrains.com/ides/");
        businessButton.click();
        LOG.info("Перешли на вкладку бизнес-тарифов");
    }

    public void compareUrl() {
        String compareUrl = "https://www.jetbrains.com/business/";
        LOG.info("В поисковой строке url: " + compareUrl);
        assertEquals(compareUrl, driver.getCurrentUrl(), "url не совпадает");
    }

    public void checkLearnMoreLink() {
        exploreOffersLink.click();
        String compareUrlExploreOffersLink = "https://www.jetbrains.com/store/?section=discounts";
        LOG.info("Кликнули по ссылке ExploreOffers. В поисковой строке url: " + compareUrlExploreOffersLink);
        assertEquals(compareUrlExploreOffersLink, driver.getCurrentUrl(), "url не совпадает");
    }

    public void clickLearnMoreLink() {
        learnMoreLink.click();
        String compareUrlLearnMoreLink = "https://www.jetbrains.com/startups/#startup-program";
        LOG.info("В поисковой строке url: " + compareUrlLearnMoreLink);
        assertEquals(compareUrlLearnMoreLink, driver.getCurrentUrl());
    }
}