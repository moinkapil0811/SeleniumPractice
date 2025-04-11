package testngattribute;

import org.testng.annotations.Test;

public class TestNgAttributeEx {

    @Test(invocationCount = 1000 , invocationTimeOut = 1)
    public void testNgAttribute(){
        System.out.println("attribute");
    }
}
