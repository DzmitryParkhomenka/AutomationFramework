package Tests;

import BaseClasses.BaseTest;
import PageObjects.GooglePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GooglePageTest extends BaseTest {

    private GooglePage googlePage;

    private String searchKeys = "Youtube";

    @BeforeTest
    public void testPreconditions() {
        googlePage = new GooglePage(driver);
    }

    @AfterTest
    public void testPostConditions() {
    }

    @Test
    public void googlePageTest() {
        openGooglePage();
        assertGooglePageLoaded();
        clickIntoSearchField();
        sendKeysToSearchField();
        clickSearchButton();
    }

    private void openGooglePage() {
        googlePage.openPage();
    }

    private void assertGooglePageLoaded() {
        Assert.assertEquals(googlePage.getPageName(), driver.getTitle());
    }

    private void clickIntoSearchField() {
        googlePage.clickSearchField();
    }

    private void sendKeysToSearchField() {
        googlePage.sendKeysToSearchField(searchKeys);
    }

    private void clickSearchButton() {
        googlePage.clickSearchButton();
    }
}
