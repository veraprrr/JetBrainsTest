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
    public void businessButton(){
        AllIDEsPage allIDEsPage = new AllIDEsPage(getDriver());
        allIDEsPage.acceptCokies();
        allIDEsPage.clickBusinessButton();
        AllIDEsPage url = new AllIDEsPage(getDriver());
        url.compareUrl();
    }
    
}