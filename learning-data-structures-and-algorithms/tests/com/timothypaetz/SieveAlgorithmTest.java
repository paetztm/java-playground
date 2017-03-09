package com.timothypaetz;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paetztm on 3/8/2017.
 */
public class SieveAlgorithmTest {

    @Test
    public void testTwoIsOne() {
        SieveAlgorithm sieveAlgorithm = new SieveAlgorithm();
        int count = sieveAlgorithm.countPrimesUpTo(2);
        int expected = 2;
        assertEquals(expected, count);
    }

    @Test
    public void testThreeIsTwo() {
        SieveAlgorithm sieveAlgorithm = new SieveAlgorithm();
        int expected = 2;
        int actual = sieveAlgorithm.countPrimesUpTo(3);
        assertEquals(expected, actual);
    }

    @Test
    public void testTenIsFour() {
        SieveAlgorithm sieveAlgorithm = new SieveAlgorithm();
        int expected = 4;
        int actual = sieveAlgorithm.countPrimesUpTo(10);
        assertEquals(expected, actual);
    }

    @Test
    public void test100Is25() {
        SieveAlgorithm sieveAlgorithm = new SieveAlgorithm();
        int expected = 25;
        int actual = sieveAlgorithm.countPrimesUpTo(100);
        assertEquals(expected, actual);
    }
}