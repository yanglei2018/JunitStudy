package test;

import Demo01.calculator;
import org.junit.Assert;
import org.junit.Test;

public class calculatorTest {
    /*
    测试add方法
     */
    @Test
    public void testAdd(){
        calculator cal = new calculator();
        int add = cal.add(1, 1);
        //断言
        Assert.assertEquals(2,add);

    }
}
