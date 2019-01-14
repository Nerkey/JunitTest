package com.test.junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest2 {

    private Calculator cal;

    @BeforeClass
    public static void globalInit() {
        System.out.println("global init");
    }

    @AfterClass
    public static void globalDestroy() {
        System.out.println("global destroy");
    }

    @Before
    public void init() {
        cal = new Calculator();
        System.out.println("init");
    }

    @After
    public void destroy() {
        System.out.println("destroy");
    }


    @Test
    public void myAdd() {
        int result = cal.add(1, 2);

        assertEquals(3, result);
    }

    @Test
    public void myMinus() {
        int result = cal.minus(1, 2);

        assertEquals(-1, result);
    }

    @Test
    public void myMultiply() {
        int result = cal.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void myDivide() {
        int result = 0;
        try {
            result = cal.divide(6, 5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(1, result);
    }

    @Test(expected = Exception.class, timeout = 1)
    public void myDivide2() throws Exception {
        cal.divide(1, 0);

    }

}
