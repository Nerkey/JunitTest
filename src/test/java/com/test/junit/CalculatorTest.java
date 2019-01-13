package com.test.junit;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Junit3.8中测试类必须要继承TestCase父类
 */
public class CalculatorTest extends TestCase {

    private Calculator cal;

    @Override
    public void setUp() throws Exception {
        cal = new Calculator();

    }

    @Override
    public void tearDown() throws Exception {

    }

    /**
     * Junit3.8中, 测试方法满足如下原则
     * 1. public
     * 2. void
     * 3. 无方法参数
     * 4. 方法名称必须以test开头
     */


    public void testAdd() {
        int result = cal.add(1, 2);

        Assert.assertEquals(3, result);
    }

    public void testMinus() {
        int result = cal.minus(1, 2);

        Assert.assertEquals(-1, result);

    }

    public void testMultiply() {
        int result = cal.multiply(2, 3);

        Assert.assertEquals(6, result);
    }

    public void testDivide() {
        int result = 0;
        try {
            result = cal.divide(6, 4);
        } catch (Exception e) {
            e.printStackTrace();

            Assert.fail();
        }

        Assert.assertEquals(1, result);
    }

    public void testDivide2() {
        Throwable tx = null;

        try {
            cal.divide(4, 0);

            Assert.fail();
        } catch (Exception e) {
            tx = e;
        }

        Assert.assertNotNull(tx);
        Assert.assertEquals(Exception.class, tx.getClass());
        Assert.assertEquals("除数不能为0!", tx.getMessage());

    }

}