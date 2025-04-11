package parametarization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleDataProvider {

    @DataProvider(name = "kapil")
  public Object[][] dataFun(){
  return new Object[][]{
          {"pune","java"},{"mumbai","java8"},{"nashik","html"}
  };
  }


    @Test(dataProvider = "kapil")
    public void verifyEdso(String courseName, String cityName) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/ ");
        driver.manage().window().maximize();
        WebElement searchdata = driver.findElement(By.name("q"));
        searchdata.sendKeys(courseName+" "+cityName);
        searchdata.sendKeys(Keys.ENTER);

        driver.close();
    }
}
