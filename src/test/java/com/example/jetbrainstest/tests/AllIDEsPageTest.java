package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.AllIDEsPage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AllIDEsPageTest extends BaseTest {

    private AllIDEsPage allIDEsPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        allIDEsPage = new AllIDEsPage(getDriver());
    }

    @Test
    @Step("Проверка переключения на страницу с бизнес-тарифами")
    public void businessButtonTest(){
        allIDEsPage.acceptCookies();
        allIDEsPage.clickBusinessButton();
        allIDEsPage.compareUrl();
    }
}