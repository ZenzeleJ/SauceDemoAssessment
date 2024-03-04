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

    @FindBy(xpath = "//div[@class='inventory_item_price'][contains(.,'$29.99')]")
    static WebElement itemPrice_xpath;

    @FindBy(xpath = "//div[@class='summary_tax_label'][contains(.,'Tax: $2.40')]")
    static WebElement tax_xpath;

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label'][contains(.,'Total: $32.39')]")
    static WebElement total_xpath;

    @FindBy(id = "finish")
    static WebElement finishButton_id;

    @FindBy(id = "cancel")
    static WebElement cancelButton_id;

    @FindBy(xpath = "//button[contains(@id,'react-burger-menu-btn')]")
    static WebElement burgerMenuButton_id;

    @FindBy(xpath = "//a[contains(@id,'link')][@class='bm-item menu-item'][contains(.,'Logout')]")
    static WebElement logoutButton_id;

    public static void verifyCheckoutOverviewLabel() {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(checkoutOverview_xpath));
        String checkoutOverviewText = checkoutOverview_xpath.getText();
        Assert.assertEquals(checkoutOverviewText, "Checkout: Overview");
    }

    public static void verifySauceLabsBackpackProductIsDisplayedInCheckOverviewPage() {
        String checkoutText = SauceLabsBackpack_xpath.getText();
        Assert.assertEquals(checkoutText, "Sauce Labs Backpack");
    }

    public static void verifyItemTotalPlusTax() {
        double number;
       // double itemPrice = Double.parseDouble(itemPrice_xpath.getText());
        String itemPrice = String.valueOf("number");
        //double tax = Double.parseDouble(tax_xpath.getText());
        String tax = String.valueOf("number");
        //double total = Double.parseDouble(total_xpath.getText());
        String total = String.valueOf("number");

        String s1 ="$29.99";
                String substring;
        s1.substring(0);
                //assertEquals(itemPrice + tax + total, 2.40, "Total plus tax should be equal to total");

      if(itemPrice +tax ==total)

       {
           finishButton_id.click ();
       } else

        {
            cancelButton_id.click ();
        }
    }

    public static void clickFinishButton() {finishButton_id.click();}

    public static void clickCancelButton() {cancelButton_id.click();}

    public static void clickBurgerMenuButton(){burgerMenuButton_id.click();}

    public static void clickLogoutFromBurgerMenu() {logoutButton_id.click();}
}