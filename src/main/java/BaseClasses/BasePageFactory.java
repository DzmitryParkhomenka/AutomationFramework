package BaseClasses;

import org.openqa.selenium.WebDriver;

public class BasePageFactory {

    protected WebDriver driver;

    public BasePageFactory(WebDriver driver) {
        this.driver = driver;
    }
}
