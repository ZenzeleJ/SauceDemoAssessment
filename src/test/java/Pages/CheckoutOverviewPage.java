package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CheckoutOverviewPage {
    public static WebDriver driver;
    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Overview')]")
    static WebElement checkoutOverview_xpath;

    @FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]")
    static WebElement SauceLabsBackpack_xpath;

    public static void verifyCheckoutOverviewLabel() {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(checkoutOverview_xpath));
        String checkoutOverviewText = checkoutOverview_xpath.getText();
        Assert.assertEquals(checkoutOverviewText, "Checkout: Overview");
    }

    public static void verifySauceLabsBackpackProductIsDisplayedInCheckOverviewPage() {
        String checkoutText = SauceLabsBackpack_xpath.getText();
        Assert.assertEquals(checkoutText, "Sauce Labs Backpack");
    }

}