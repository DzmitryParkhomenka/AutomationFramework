package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    protected BaseActions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        actions = new BaseActions(driver);
        PageFactory.initElements(driver, this);
    }
}
