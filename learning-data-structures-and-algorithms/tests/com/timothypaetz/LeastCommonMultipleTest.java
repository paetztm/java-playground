package com.timothypaetz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paetztm on 3/8/2017.
 */
public class LeastCommonMultipleTest {

    @Test
    public void testLeastCommonDenominator() {
        LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple(new EuclidsAlgorithm());
        assertEquals(leastCommonMultiple.getLeastCommonMultiple(12,
                                                                15),
                     60);
    }

    @Test
    public void testLargeNumbers() {
        LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple(new EuclidsAlgorithm());
        assertEquals(20_000, leastCommonMultiple.getLeastCommonMultiple(10_000, 20_000));
    }

}