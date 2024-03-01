package Tests;

import Pages.CheckOutInformationPage;
import Pages.YourCartPage;
import org.testng.annotations.Test;

import java.io.IOException;

@Test
public class PurchaseProductTests extends Base {

    public PurchaseProductTests() throws IOException {
    }

    public void enterUsernameTests() {
        loginPage.enterUsername(username);
    }

    public void enterPasswordTests() {
        loginPage.enterPassword(password);
        takeScreenshots.takeSnapShot(driver, "Login Screen");
    }

    @Test(dependsOnMethods = {"enterUsernameTests", "enterPasswordTests"})
    public void clickLoginTests() {
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
        homePage.verifyProductLabelIsDisplayedInHomePage();
        takeScreenshots.takeSnapShot(driver, "Home Screen");
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void clickAddToCart() {
        productPage.clickAddToCart();
    }

    @Test(dependsOnMethods = "clickAddToCart")
    public void verifyAddedToCart() {
        productPage.verifyAddedToCart();
        takeScreenshots.takeSnapShot(driver, "Add To Cart");
    }

    @Test(dependsOnMethods = "verifyAddedToCart")
    public void clickNavigateToCart() {
        YourCartPage.clickNavigateToCart();
    }

    @Test(dependsOnMethods = "clickNavigateToCart")
    public void verifyYourCartLabelIsDisplayedInCartPage() {
        YourCartPage.verifyYourCartLabelIsDisplayedInCartPage();
        takeScreenshots.takeSnapShot(driver, "Your Cart");
    }

    @Test(dependsOnMethods = "verifyYourCartLabelIsDisplayedInCartPage")
    public void verifySauceLabsBackpackProductIsDisplayedInCartPage() {
        YourCartPage.verifySauceLabsBackpackProductIsDisplayedInCartPage();
        takeScreenshots.takeSnapShot(driver, "Sauce Labs Backpack");
    }

    @Test(dependsOnMethods = "verifySauceLabsBackpackProductIsDisplayedInCartPage")
    public void clickCheckout() {
        YourCartPage.clickCheckout();
        takeScreenshots.takeSnapShot(driver, "checkout");
    }

    @Test(dependsOnMethods = "clickCheckout")
    public void verifyCheckoutYourInformationPage() {
        CheckOutInformationPage.verifyCheckoutYourInformationPage();
        takeScreenshots.takeSnapShot(driver, "Checkout: Your Information");
    }
    @Test(dependsOnMethods = "verifyCheckoutYourInformationPage")
    public void enterFirstNameTests() {
        CheckOutInformationPage.enterFirstName("John");
    }
    @Test(dependsOnMethods = "verifyCheckoutYourInformationPage")
    public void enterLastnameTests() {
        CheckOutInformationPage.enterLastName("Uys");
        //loginPage.enterUsername(readFromExcel.username);
    }
    @Test(dependsOnMethods = "verifyCheckoutYourInformationPage")
    public void enterPostalCodeTests() {
        CheckOutInformationPage.enterPostalCode("1458");
        takeScreenshots.takeSnapShot(driver, "Details");

    }
    @Test(dependsOnMethods = {"enterFirstNameTests","enterLastnameTests","enterPostalCodeTests"})
    public void clickContinueButton() {checkoutInformationPage.clickContinueButton();
    }

}