package testngattribute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupEx {

    @Test(groups = {"smoke"})
    public  void verifyLogin(){
         Assert.assertTrue(false);
        System.out.println("Verify login page");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyHomePage(){
        System.out.println("home page");
    }

    @Test
    public void verifyOnbordingPage(){
        System.out.println("onbording page");
    }
}
