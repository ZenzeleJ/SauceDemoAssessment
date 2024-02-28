package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    public WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton_id;


    public void clickAddToCart() {
        addToCartButton_id.click();
    }
   // public void clickAddToCart(){
    //    driver.findElement(By.xpath("//button[contains(@name,'add-to-cart-sauce-labs-backpack')]")).click();
      //  driver.findElement(By.xpath("//button[contains(@name,'add-to-cart-sauce-labs-bike-light')]")).click();
      //  driver.findElement(By.xpath("//button[contains(@name,'add-to-cart-test.allthethings()-t-shirt-(red)')]")).click();

    }

