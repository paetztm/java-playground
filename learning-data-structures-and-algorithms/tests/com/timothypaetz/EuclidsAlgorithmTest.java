package com.timothypaetz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paetztm on 3/6/2017.
 */
public class EuclidsAlgorithmTest {

    @Test
    public void testGreatestCommonDenominatorOf30and24is6() {
        EuclidsAlgorithm euclidsAlgorithm = new EuclidsAlgorithm();
        int n = euclidsAlgorithm.getGreatestCommonDenominator(24, 30);
        assertEquals(6, n);
    }

    @Test
    public void testGreatestCommonDenominatorOf9and12is3() {
        EuclidsAlgorithm euclidsAlgorithm = new EuclidsAlgorithm();
        int n = euclidsAlgorithm.getGreatestCommonDenominator(9, 12);
        assertEquals(3, n);
    }

    @Test
    public void testGreatestCommonDenominatorOf78And66Is6() {
        EuclidsAlgorithm euclidsAlgorithm = new EuclidsAlgorithm();
        int n = euclidsAlgorithm.getGreatestCommonDenominator(78, 66);
        assertEquals(6, n);
    }
}