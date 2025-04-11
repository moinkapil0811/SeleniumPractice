package basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgBasic {

    @Test
    public void verifyGoogleService() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.close();
    }

    @Test
    public void verifyFlipcartService() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.close();
    }

    @Test
    public void verifyJavatPoint() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tpointtech.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.close();
    }


}
