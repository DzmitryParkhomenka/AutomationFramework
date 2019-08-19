package BaseTest;

import Driver.DriverManager;
import Driver.DriverManagerFactory;
import Driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BaseTest {
    public DriverManager driverManager;
    public WebDriver driver;

    @Test
    public void navigateToGoogleTest() {
        driverManager = DriverManagerFactory.getDriver(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
    }

    @AfterTest
    public void tearDown() {
        driverManager.quitDriver();
    }
}
