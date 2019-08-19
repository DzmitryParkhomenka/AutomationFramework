package BaseTest;

import Driver.DriverManager;
import Driver.DriverManagerFactory;
import Driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public DriverManager driverManager;
    public WebDriver driver;

    @BeforeSuite
    public void driverInitializer(DriverType type) {
        driverManager = DriverManagerFactory.getDriver(type);
        driver = driverManager.getDriver();
    }

    @AfterSuite
    public void tearDown() {
        driverManager.quitDriver();
    }
}
