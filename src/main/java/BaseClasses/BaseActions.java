package BaseClasses;

import org.openqa.selenium.WebDriver;

public class BaseActions {
    private WebDriver driver;

    public BaseActions(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url){
        driver.get(url);
    }
}
