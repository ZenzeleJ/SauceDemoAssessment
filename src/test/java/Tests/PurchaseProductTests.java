package Tests;

import Pages.YourCartPage;
import org.testng.annotations.Test;

@Test
public class PurchaseProductTests extends Base {

    public void enterUsernameTests() {
        loginPage.enterUsername("standard_user");
        //loginPage.enterUsername(readFromExcel.username);
    }

    public void enterPasswordTests() {
        loginPage.enterPassword("secret_sauce");
//        loginPage.enterPassword(readFromExcel.password);
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
    }
}