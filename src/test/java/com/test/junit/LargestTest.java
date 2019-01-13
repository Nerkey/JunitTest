package com.test.junit;

import junit.framework.Assert;
import junit.framework.TestCase;

public class LargestTest extends TestCase {

    private Largest largest;

    @Override
    protected void setUp() throws Exception {
        largest = new Largest();
    }

    public void testGetLargest() {
        int[] array = {1, 9, 10, -20, 23};

        int result = 0;
        try {
            result = this.largest.getLargest(array);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

        Assert.assertEquals(23, result);

    }

    public void testGetLargest2() {
        Throwable tx = null;

        int[] array = {};

        try {
            largest.getLargest(array);
            Assert.fail();
        } catch (Exception e) {
            e.printStackTrace();
            tx = e;
        }

        Assert.assertNotNull(tx);
        Assert.assertEquals(Exception.class, tx.getClass());
        Assert.assertEquals("数组不能为空!", tx.getMessage());
    }

    public void testGetLargest3() {
        Throwable tx = null;

        try {
            int[] array = null;
            largest.getLargest(array);
            Assert.fail();
        } catch (Exception e) {
            e.printStackTrace();
            tx = e;
        }

        Assert.assertNotNull(tx);
        Assert.assertEquals(Exception.class, tx.getClass());
        Assert.assertEquals("数组不能为空!", tx.getMessage());

    }
}