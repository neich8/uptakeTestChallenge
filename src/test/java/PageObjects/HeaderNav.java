package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nick on 4/3/16.
 */
public class HeaderNav {
    WebDriver driver;

    @FindBy(className="icon--logo")
    WebElement logo;

    @FindBy(id="menu-item-4164")
    WebElement approach;

    @FindBy(id="menu-item-4163")
    WebElement platform;

    @FindBy(id="menu-item-4172")
    WebElement solutions;

    @FindBy(id="menu-item-4162")
    WebElement people;

    @FindBy(id = "menu-item-4167")
    WebElement joinUs;

    @FindBy(id="menu-item-4166")
    WebElement blog;


    public HeaderNav(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public WebElement getLogo() {
        return driver.findElement(By.cssSelector(".icon--logo"));
    }

    public void clickLogo() {
        System.out.println("clicking");
        logo.click();
    }
}
