package test;

import Demo01.calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calculatorTest {

    /**
     * 初始化
     */
    @Before
    public void init(){
        System.out.println("init......");
    }

    /**
     * 关闭执行资源
     */
    @After
    public void close(){
        System.out.println("close......");
    }
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
