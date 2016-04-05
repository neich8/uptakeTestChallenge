import PageObjects.HomePage;
import PageObjects.SolutionsPage;
import junit.framework.Assert;
import org.testng.annotations.Test;

/**
 * Created by nick on 4/4/16.
 */
public class SolutionsTest extends BaseTest {
    SolutionsPage solutionsPage;
    HomePage homePage;

    @Test
    public void linkToHomePageTest() {
        driver.get("http://uptake.com/solutions");
        solutionsPage = new SolutionsPage(driver);
        homePage = solutionsPage.headerNav.clickLogo();
        Assert.assertTrue(homePage.getUptakeDescription().isDisplayed());
    }
}
