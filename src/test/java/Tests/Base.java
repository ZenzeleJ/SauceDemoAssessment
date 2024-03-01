package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chRoMe", "https://www.saucedemo.com/");
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
    YourCartPage yourCartPage = PageFactory.initElements(driver, YourCartPage.class);
    CheckOutInformationPage checkoutInformationPage = PageFactory.initElements(driver, CheckOutInformationPage.class);
    TakeScreenshots takeScreenshots = new TakeScreenshots();



//    ReadFromExcel readFromExcel;
//
//    {
//        try {
//            readFromExcel = new ReadFromExcel();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}