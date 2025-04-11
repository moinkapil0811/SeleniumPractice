package basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityEx {

    @Test(priority = 5)
    public  void testCaseY(){
        System.out.println("test case y..");
    }

    @Test(priority = 2 , enabled = false)
    public  void testCaseB(){
        System.out.println("test case B..");
    }

    @Test(priority = 4)
    public  void testCaseP(){

        System.out.println("test case p..");
    }
    @Test(priority = 3)
    public  void testCaseE(){
        System.out.println("test case E..");
    }
    @Test(priority = 1)
    public  void testCaseX(){
        System.out.println("test case x..");
    }
}
