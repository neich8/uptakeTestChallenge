package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by nick on 4/3/16.
 */
public class HomePage extends BasePageObject {
    public HeaderNav headerNav;

    @FindBy(css ="#actions a")
    WebElement solutionsLink;

    @FindBy(className = "icon--next")
    WebElement scrollDownLink;

    @FindBy(id = "callout")
    WebElement uptakeDescription;

    public HomePage(WebDriver driver) {
        super(driver);
        headerNav = new HeaderNav(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void scrollDown() {
        scrollDownLink.click();
    }

    public WebElement getUptakeDescription() {
        return uptakeDescription;
    }

    public SolutionsPage clickLinktoSolutionsPage() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(solutionsLink));
        solutionsLink.click();
        return new SolutionsPage(driver);
    }
}


