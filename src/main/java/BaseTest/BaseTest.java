package BaseTest;

import Driver.DriverManager;
import Driver.DriverManagerFactory;
import Types.DriverType;
import Types.ParameterType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
    public DriverManager driverManager;
    public WebDriver driver;

    @BeforeSuite
    @Parameters(ParameterType.DRIVER_TYPE)
    public void driverInitializer(DriverType type) {
        driverManager = DriverManagerFactory.getDriver(type);
        driver = driverManager.getDriver();
    }

    @AfterSuite
    public void tearDown() {
        driverManager.quitDriver();
    }
}
