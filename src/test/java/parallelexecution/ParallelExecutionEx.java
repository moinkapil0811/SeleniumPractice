package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionEx {

    @Test
    public void openCg(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://capgemin.com/?pid=9POGY27R0");
        driver.manage().window().maximize();

        driver.close();
    }

    @Test
    public void openEdso(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://edso.in/");
        driver.manage().window().maximize();

        driver.close();
    }

    @Test
    public void openInfosys(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();

        driver.close();
    }

}
