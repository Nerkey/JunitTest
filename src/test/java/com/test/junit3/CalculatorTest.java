package com.test.junit3;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Junit3.8中测试类必须要继承TestCase父类
 */
public class CalculatorTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        System.out.println("setUp");
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    /**
     *Junit3.8中, 测试方法满足如下原则
     *     1. public
     *     2. void
     *     3. 无方法参数
     *     4. 方法名称必须以test开头
     */



    public void testAdd() {
        Calculator cal = new Calculator();
        int result = cal.add(1, 2);

        Assert.assertEquals(3, result);
    }

    public void testMinus() {
    }

    public void testMultiply() {
    }

    public void testDivide() {
    }
}