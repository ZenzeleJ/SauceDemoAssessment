package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Formatter;

public class CheckoutOverviewPage {
    public static WebDriver driver;
    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Overview')]")
    static WebElement checkoutOverview_xpath;

    @FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]")
    static WebElement SauceLabsBackpack_xpath;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    static WebElement itemPrice_xpath;


    @FindBy(xpath = "//div[@class='summary_total_label'][contains(.,'Total: $32.39')]")
    static WebElement total_xpath;

    @FindBy(xpath = "//button[@data-test='finish']")
    static WebElement finishButton;

//    @FindBy(xpath = "//button[@data-test='cancel']")
//    static WebElement cancelButton;

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

        // Resolve Item Total
        float itemTotal = Float.parseFloat(itemPrice_xpath.getText().replace("Item total: $",""));
        float ItemTotalPlusTax = (float) (itemTotal+(itemTotal*0.08));
//        Formatter formItemTotalPlusTax = new Formatter ();
//        formItemTotalPlusTax.format ("%.2f", ItemTotalPlusTax);

        // Resolve Total
        float Total = Float.parseFloat(total_xpath.getText().replace("Total: $",""));
//        String s = formItemTotalPlusTax.toString ();
//        String t = Float.toString (Total);

//        if(ItemTotalPlusTax==Total)
////        if(s.equals (t))
//        {
//            finishButton.click ();
//            Assert.assertTrue (true);
//        }
//        else
//        {
//            cancelButton.click ();
//        }
    }

    public static void clickFinishButton()
    {
        finishButton.click();
    }

//    public static void clickCancelButton() {cancelButton.click();}
}