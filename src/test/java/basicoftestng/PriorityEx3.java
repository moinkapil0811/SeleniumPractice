package basicoftestng;

import org.testng.annotations.Test;

public class PriorityEx3 {

    @Test(priority = 'b')
    public  void testCaseY(){
        System.out.println("test case y..");
    }

    @Test(priority = 'a')
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
