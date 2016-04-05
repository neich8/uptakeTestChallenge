package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by nick on 4/4/16.
 */
public class BasePageObject {
    protected WebDriver driver;

    @FindBy(css = ".notFound")
    List<WebElement> errorPage;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean notFound() {
        return errorPage.size() > 0;
    }
}
