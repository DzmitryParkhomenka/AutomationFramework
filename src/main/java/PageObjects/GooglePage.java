package PageObjects;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage {

    private static final String GOOGLE_PAGE_URL = "https://accounts.google.com";

    @FindBy(name = "q")
    public WebElement searchField;

    public GooglePage(WebDriver driver) {
        super(driver);
    }

}
