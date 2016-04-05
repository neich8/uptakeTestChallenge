package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nick on 4/3/16.
 */
public class HomePage extends BasePageObject {
    public HeaderNav headerNav;

    @FindBy(css ="#actions a")
    WebElement solutionsLink;

    @FindBy(className = "icon--next")
    WebElement scrollDownLink;

    public HomePage(WebDriver driver) {
        super(driver);
        new HeaderNav(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void scrollDown() {
        scrollDownLink.click();
    }

    public SolutionsPage clickLinktoSolutionsPage() {
        try {
            solutionsLink.click();
        } catch (WebDriverException e) {
            System.out.println("try scrolling down the page first");
        }
        return new SolutionsPage(driver);
    }
}


