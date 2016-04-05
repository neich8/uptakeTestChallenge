
import PageObjects.HomePage;

import PageObjects.SolutionsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nick on 4/3/16.
 */
public class HomePageTest extends BaseTest{
    private HomePage homePage;
    private SolutionsPage solutionsPage;


    @Test
    public void solutionsLinkTest() {
        homePage = new HomePage(driver);
        homePage.scrollDown();
        solutionsPage = homePage.clickLinktoSolutionsPage();
        Assert.assertFalse(solutionsPage.notFound());
        Assert.assertTrue(solutionsPage.conditionMonitoringSectionisDisplayed(), "Conditions Monitoring section not displayed");
    }
}
