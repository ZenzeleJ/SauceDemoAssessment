package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class YourCartPage {

    public static WebDriver driver;
    @FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
    static WebElement shoppingCart_xpath;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Your Cart')]")
    static WebElement yourCartLabel_xpath;

    public static void clickNavigateToCart() {
        shoppingCart_xpath.click();}
        public static void verifyYourCartLabelIsDisplayedInCartPage() {
            new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(yourCartLabel_xpath));
            String productText = yourCartLabel_xpath.getText();
            Assert.assertEquals(productText, "Your Cart");
        }
    }
