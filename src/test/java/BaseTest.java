import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


/**
 * Created by nick on 4/3/16.
 */
public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void beforeEveryMethod() {
        driver = new FirefoxDriver();
        driver.get("http://uptake.com");
    }

    @AfterMethod
    public void afterEveryMethod() {
        driver.quit();
        driver = null;
    }

}
