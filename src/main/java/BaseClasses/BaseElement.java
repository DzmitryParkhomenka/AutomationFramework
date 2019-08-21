package BaseClasses;

import org.openqa.selenium.By;

public class BaseElement {

    private String name;
    private By webLocator;

    public BaseElement(String name, By webLocator) {
        this.name = name;
        this.webLocator = webLocator;
    }

    public String getName() {
        return name;
    }

    public By getWebLocator() {
        return webLocator;
    }
}
