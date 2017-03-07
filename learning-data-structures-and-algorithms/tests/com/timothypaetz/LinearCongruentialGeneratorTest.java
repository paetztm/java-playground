package com.timothypaetz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paetztm on 3/6/2017.
 */
public class LinearCongruentialGeneratorTest {

    private static final int A = 5;
    private static final int B = 3;
    private static final int M = 7;
    private LinearCongruentialGenerator linearCongruentialGenerator;

    @Test
    public void testNZeroIsZero(){
        int n = linearCongruentialGenerator.calculate(0);
        assertEquals(0, n);
    }

    @Test
    public void testNOneIsThree() {
        int n = linearCongruentialGenerator.calculate(1);
        assertEquals(3, n);
    }

    @Test
    public void testNTwoIsFour() {
        int n = linearCongruentialGenerator.calculate(2);
        assertEquals(4, n);
    }

    @Before
    public void initializeGenerator() {
        linearCongruentialGenerator = new LinearCongruentialGenerator(A,
                                                                      B,
                                                                      M);
    }
}