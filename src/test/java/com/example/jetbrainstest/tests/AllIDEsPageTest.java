package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.AllIDEsPage;
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
    public void businessButtonTest(){
        allIDEsPage.acceptCookies();
        LOG.info("Принимаем куки");
        allIDEsPage.clickBusinessButton();
        LOG.info("Перешли на вкладку бизнес-тарифов");
        allIDEsPage.compareUrl();
    }

    @Test
    public void exploreOffersLinkTest(){
        allIDEsPage.acceptCookies();
        LOG.info("Принимаем куки");
        allIDEsPage.clickExploreOffersLink();
        LOG.info("Кликнули по ссылке ExploreOffers");
        allIDEsPage.clickLearnMoreLink();
    }
}