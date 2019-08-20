package PageObjects;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage {

    private static final String GOOGLE_PAGE_URL = "https://google.com";
    private static final String GOOGLE_PAGE_NAME = "Google";

    @FindBy(name = "q")
    public WebElement searchField;

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        actions.openPage(GOOGLE_PAGE_URL);
    }

    public String getPageName() {
        return actions.getPageName(GOOGLE_PAGE_NAME);
    }

}
