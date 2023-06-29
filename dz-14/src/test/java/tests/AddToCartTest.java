package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCartTest {

    @Test
    public void testAddItemToCart() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.cssSelector("[class='product-item']:nth-of-type(1)")).click();
        driver.findElement(By.cssSelector("#option-label-size-143-item-166")).click();
        driver.findElement(By.cssSelector("#option-label-color-93-item-50")).click();
        driver.findElement(By.cssSelector("[class ='action primary tocart']")).click();
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(8)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class ='action viewcart']")));
        driver.findElement(By.cssSelector("[class='action showcart']")).click();
        driver.findElement(By.cssSelector("[class ='action viewcart']")).click();
        String itemName = driver.findElement(By.cssSelector("[class='cart item'] .product-item-name")).getText();
        Assert.assertEquals(itemName, "Radiant Tee", "name is wrong");
        
        driver.close();
        driver.quit();



    }

}
