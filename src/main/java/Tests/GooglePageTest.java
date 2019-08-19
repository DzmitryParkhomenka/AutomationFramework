package Tests;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePageTest extends BaseTest {

    @Test
    public void googlePageTest() {
        driver.get("https://www.google.com/");
        Assert.assertEquals("Google", driver.getTitle());
    }
}
