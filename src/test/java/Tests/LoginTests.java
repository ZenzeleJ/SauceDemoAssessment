package Tests;

import org.testng.annotations.Test;

@Test
public class  LoginTests extends Base{

    public void enterUsernameTests(){
        loginPage.enterUsername(readFromExcel.username);
    }

    public void enterPasswordTests(){
        loginPage.enterPassword(readFromExcel.password);
        takeScreenshots.takeSnapShot(driver,"Login Screen");
    }

    @Test(dependsOnMethods = {"enterUsernameTests","enterPasswordTests"})
    public void clickLoginTests(){
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess(){
        homePage.verifyProductLabelIsDisplayedInHomePage();
        takeScreenshots.takeSnapShot(driver,"Home Screen");
    }
    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void clickAddToCart(){
        productPage.clickAddToCart();

    }

    /*@Test(dependsOnMethods = "clickAddToCart")
    public void verifyProductInCart(){
        productPage.verifyProductInCart();
        takeScreenshots.takeSnapShot(driver,"In_the_Cart");
    }*/
}