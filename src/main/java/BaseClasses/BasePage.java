package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;
    public BaseActions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        actions = new BaseActions(driver);
        PageFactory.initElements(driver, this);
    }
}
