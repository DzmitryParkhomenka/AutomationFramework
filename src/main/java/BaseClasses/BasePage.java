package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    protected BaseActions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        actions = new BaseActions(driver);
    }

    protected void waitForElementsToBeVisible(int timeout, BaseElement element) {
        waitFor(timeout).until(ExpectedConditions.visibilityOf(actions.getWebElement(element)));
    }

    protected void waitForElementsToBeInvisible(int timeout, BaseElement element) {
        waitFor(timeout).until(ExpectedConditions.invisibilityOf(actions.getWebElement(element)));
    }

    public WebDriverWait waitFor(int timeout) {
        return new WebDriverWait(driver, timeout);
    }
}
