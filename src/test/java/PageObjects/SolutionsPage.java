package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by nick on 4/4/16.
 */
public class SolutionsPage extends BasePageObject {
    public HeaderNav headerNav;

    @FindBy(id = "industrial")
    WebElement conditionMonitoringSection;

    @FindBy(css = "#industrial .icon--illo")
    WebElement conditionMonitoringIcon;

    @FindBy(css = "#industrial .lead")
    WebElement conditionMonitoringText;

    public SolutionsPage(WebDriver driver) {
        super(driver);
        headerNav = new HeaderNav(driver);

        PageFactory.initElements(driver, this);
    }


    public boolean conditionMonitoringSectionisDisplayed() {
        return conditionMonitoringSection.isDisplayed() &&
                conditionMonitoringIcon.isDisplayed() &&
                conditionMonitoringText.isDisplayed();
    }

}
