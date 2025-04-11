package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {

    @Test
    public  void verfySouceDemoApp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        WebElement souceapp=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        WebElement product=driver.findElement(By.xpath("//span[text()='Products']"));

        Assert.assertFalse(souceapp.isDisplayed(),"swag lab element is displayed..");
        Assert.assertTrue(product.isDisplayed(),"products element is displayed..");
        driver.close();
    }
}
