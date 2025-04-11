package basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotationEx {

    public static WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        driver=new ChromeDriver();
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }

    @Test
    public void verifyGoogleService() throws InterruptedException {
        driver.get("https://mail.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void verifyFlipcartService() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void verifyJavatPoint() throws InterruptedException {
        driver.get("https://www.tpointtech.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

}
