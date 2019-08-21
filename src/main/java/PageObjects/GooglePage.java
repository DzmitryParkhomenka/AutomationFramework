package PageObjects;

import BaseClasses.BaseElement;
import BaseClasses.BasePage;
import Types.Timeouts;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.name;

public class GooglePage extends BasePage {

    private static final String GOOGLE_PAGE_URL = "https://google.com";
    private static final String GOOGLE_PAGE_NAME = "Google";

    private static final BaseElement SEARCH_FIELD = new BaseElement(
            "[Search field]",
            name("q")
    );

    private static final BaseElement SEARCH_BUTTON = new BaseElement(
            "[Search button]",
            name("btnK")
    );

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        actions.openPage(GOOGLE_PAGE_URL);
    }

    public String getPageName() {
        return actions.getPageName(GOOGLE_PAGE_NAME);
    }

    public void clickSearchField() {
        waitForElementsToBeVisible(Timeouts.ELEMENT_LOAD, SEARCH_FIELD);
        actions.clickElement(SEARCH_FIELD);
    }

    public void clickSearchButton() {
        waitForElementsToBeVisible(Timeouts.ELEMENT_LOAD, SEARCH_BUTTON);
        actions.clickElement(SEARCH_BUTTON);
    }

    public void sendKeysToSearchField(String keys) {
        waitForElementsToBeVisible(Timeouts.ELEMENT_LOAD, SEARCH_FIELD);
        actions.sendKeys(SEARCH_FIELD, keys);
    }
}
