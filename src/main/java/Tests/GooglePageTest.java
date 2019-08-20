package Tests;

import BaseClasses.BaseTest;
import PageObjects.GooglePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GooglePageTest extends BaseTest {

    private GooglePage googlePage;

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
    }

    private void openGooglePage() {
        googlePage.openPage();
    }

    private void assertGooglePageLoaded() {
        Assert.assertEquals(googlePage.getPageName(), driver.getTitle());
    }
}
