package com.test.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestTest2 {

    private Largest largest;

    @Before
    public void setUp() throws Exception {
        largest = new Largest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetLargest() {
        int[] array = {1, 9, 10, -20, 23};

        int result = 0;
        try {
            result = this.largest.getLargest(array);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals(23, result);
    }

    @Test(expected = Exception.class)
    public void testGetLargest2() throws Exception {
        largest.getLargest(null);
    }

    @Test(expected = Exception.class)
    @Ignore("This case is ignored")
    public void testGetLargest3() throws Exception {
        largest.getLargest(new int[]{});
    }

}