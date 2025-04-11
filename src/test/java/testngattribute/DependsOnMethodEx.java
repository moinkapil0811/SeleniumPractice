package testngattribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodEx {

    @Test
    public  void verifyLogin(){
       // Assert.assertTrue(false);
        Assert.assertTrue(true);
        System.out.println("Verify login page");
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomePage(){
        System.out.println("home page");
    }

    @Test
    public void verifyOnbordingPage(){
        System.out.println("onbording page");
    }
}
