package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProductPage {

    public WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton_id;

    /*@FindBy(xpath = "//div[@class='inventory_item_name '][contains(.,'Sauce Labs Backpack')]")
    WebElement verifyProductInCart_xpath;*/

    public void clickAddToCart() {
        addToCartButton_id.click();
    }

    /*public void verifyProductInCart() {

        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(verifyProductInCart_xpath));
        String cartlabel = verifyProductInCart_xpath.getText();
        Assert.assertEquals(cartlabel, "In_the_Cart");*/
        // public void clickAddToCart(){
        //    driver.findElement(By.xpath("//button[contains(@name,'add-to-cart-sauce-labs-backpack')]")).click();
        //  driver.findElement(By.xpath("//button[contains(@name,'add-to-cart-sauce-labs-bike-light')]")).click();
        //  driver.findElement(By.xpath("//button[contains(@name,'add-to-cart-test.allthethings()-t-shirt-(red)')]")).click();

}

