
import PageObjects.HomePage;

import PageObjects.SolutionsPage;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nick on 4/3/16.
 */
public class HomePageTest extends BaseTest{
    private SolutionsPage solutionsPage;
    private HomePage homePage;

    @Test
    public void solutionsLinkTest() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.scrollDown();
        solutionsPage = homePage.clickLinktoSolutionsPage();
        Assert.assertFalse(solutionsPage.notFound());
        Assert.assertTrue(solutionsPage.conditionMonitoringSectionisDisplayed(), "Conditions Monitoring section not displayed");
    }

    @Test
    public void solutionHeaderLinkTest() {
        homePage = new HomePage(driver);
        solutionsPage = homePage.headerNav.clickSolutions();
        Assert.assertTrue(solutionsPage.conditionMonitoringSectionisDisplayed());
    }

}
