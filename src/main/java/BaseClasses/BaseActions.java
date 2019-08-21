package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseActions {

    private WebDriver driver;

    public BaseActions(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url){
        driver.get(url);
    }

    public String getPageName(String name) {
        return name;
    }

    public WebElement getWebElement(BaseElement element) {
        return driver.findElement(element.getWebLocator());
    }

    public void clickElement(BaseElement element) {
        WebElement we = getWebElement(element);
        we.click();
    }

    public void sendKeys(BaseElement element, String keys) {
        WebElement we = getWebElement(element);
        we.sendKeys(keys);
    }
}
