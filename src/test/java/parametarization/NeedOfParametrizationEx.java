package parametarization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParametrizationEx {

    @Test
    public void verifyEdso(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/ ");
        driver.manage().window().maximize();

       WebElement searchdata= driver.findElement(By.name("q"));
       searchdata.sendKeys("javatpoint" + "pune");
       searchdata.sendKeys(Keys.ENTER);

       driver.close();

    }
}
