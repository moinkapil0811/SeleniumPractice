package basicoftestng;

import org.testng.annotations.*;

public class TestAnnotationEx2 {

    @BeforeTest
    public void beforeTestDemo(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTestDemo(){
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforClassDemo(){
        System.out.println("Before class once run ");
    }
    @AfterClass
    public void afterClassDemo(){
        System.out.println("After class once run");
    }


@BeforeMethod
public void preRequsite(){
    System.out.println("Before method");
}

@AfterMethod
public void postRequsite(){
    System.out.println("After method");
}


    @Test
    public void verifyJavatPoint()  {
        System.out.println("verify javatpoint webside");
    }
    @Test
    public void verifyFlipcart()  {
        System.out.println("verify flipcart webside");
    }

}
