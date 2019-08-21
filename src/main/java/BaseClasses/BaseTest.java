package BaseClasses;

import Driver.DriverManager;
import Types.DriverType;
import Types.ParameterType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {

    private DriverManager driverManager;
    protected WebDriver driver;

    @BeforeSuite
    @Parameters(ParameterType.DRIVER_TYPE)
    public void driverInitializer(DriverType type) {
        driverManager = new DriverManager();
        driver = driverManager.getDriver(type);
    }

    @AfterSuite
    public void tearDown() {
        driverManager.quitDriver();
    }
}
