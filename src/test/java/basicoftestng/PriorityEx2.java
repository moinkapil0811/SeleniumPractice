package basicoftestng;

import org.testng.annotations.Test;

public class PriorityEx2 {

    @Test(priority = 5,groups = "smoke")
    public  void testCaseY(){

        System.out.println("test case y..");
    }

    @Test(priority = -2 )
    public  void testCaseB(){

        System.out.println("test case B..");
    }

    @Test(priority = -1)
    public  void testCaseP(){

        System.out.println("test case p..");
    }
    @Test
    public  void testCaseE(){

        System.out.println("test case E..");
    }
    @Test(priority = 1)
    public  void testCaseX(){

        System.out.println("test case x..");
    }
}
