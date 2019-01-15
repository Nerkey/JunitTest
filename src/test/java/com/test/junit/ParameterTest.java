package com.test.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterTest {

    private int expected;

    private int input1;

    private int input2;

    @Parameters
    public static Collection prepareData() {
        Object[][] objects = {{3, 1, 2}, {0, 0, 0}, {-4, -1, -3}, {6, -3, 9}};

        return Arrays.asList(objects);
    }

    public ParameterTest(int expected, int input1, int input2) {
        this.expected = expected;
        this.input1 = input1;
        this.input2 = input2;
    }

    @Test
    public void testAdd() {
        Calculator cal = new Calculator();

        assertEquals(expected, cal.add(input1, input2));
    }

}
