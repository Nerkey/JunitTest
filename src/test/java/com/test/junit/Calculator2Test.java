package com.test.junit;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class Calculator2Test {

    @Test
    public void testAdd() {

        Calculator2 calculator2 = new Calculator2();
        Class<Calculator2> clazz = Calculator2.class;
        try {
            Method method = clazz.getDeclaredMethod("add", new Class[]{Integer.TYPE, Integer.TYPE});
            method.setAccessible(true);
            Object result = method.invoke(calculator2, new Object[]{1, 2});
            assertEquals(3, result);
        } catch (Exception e) {
            fail();
            e.printStackTrace();
        }


    }

}