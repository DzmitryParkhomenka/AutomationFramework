package Driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxManager extends DriverManager {

    @Override
    public void createDriver() {
        FirefoxOptions options = new FirefoxOptions();
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\Drivers\\geckodriver.exe");
        options.addArguments("start-maximized");
        this.driver = new FirefoxDriver(options);
    }
}
