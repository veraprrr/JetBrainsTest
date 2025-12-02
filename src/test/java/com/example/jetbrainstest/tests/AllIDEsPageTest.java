package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.NewExtension;
import com.example.jetbrainstest.pages.AllIDEsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(NewExtension.class)
public class AllIDEsPageTest extends BaseTest {

    private AllIDEsPage allIDEsPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        allIDEsPage = new AllIDEsPage(getDriver());
    }

    @Test
    public void businessButtonTest() {
        allIDEsPage.acceptCookies();
        allIDEsPage.clickBusinessButton();
        allIDEsPage.compareUrl();
    }

    @Test
    public void exploreOffersLinkTest() {
        allIDEsPage.acceptCookies();
        allIDEsPage.checkLearnMoreLink();
        allIDEsPage.clickLearnMoreLink();
    }
}