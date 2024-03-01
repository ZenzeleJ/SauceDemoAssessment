package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class CheckOutInformationPage {

    public static WebDriver driver;
    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Your Information')]")
   static  WebElement checkoutYourInformation_xpath;

    public CheckOutInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void verifyCheckoutYourInformationPage() {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(checkoutYourInformation_xpath));
        String checkoutText= checkoutYourInformation_xpath.getText();
        Assert.assertEquals(checkoutText,"Checkout: Your Information");
    }
}
