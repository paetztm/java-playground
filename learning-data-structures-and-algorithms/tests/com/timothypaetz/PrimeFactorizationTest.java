package com.timothypaetz;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paetztm on 3/8/2017.
 */
public class PrimeFactorizationTest {

    private PrimeFactorization primeFactorization;

    @Test
    public void testTwo() {
        List<Integer> primes = primeFactorization.getPrimeFactors(2);
        List<Integer> correct = Arrays.asList(2);
        assertEquals(correct, primes);
    }

    @Test
    public void testThree() {
        List<Integer> primes = primeFactorization.getPrimeFactors(3);
        List<Integer> correct = Arrays.asList(3);
        assertEquals(correct, primes);
    }

    @Test
    public void testFour() {
        List<Integer> primes = primeFactorization.getPrimeFactors(4);
        List<Integer> correct = Arrays.asList(2, 2);
        assertEquals(correct, primes);
    }
    @Test
    public void test204() {
        List<Integer> primes = primeFactorization.getPrimeFactors(204);
        List<Integer> correct = Arrays.asList(2, 2, 3, 17);
        assertEquals(correct, primes);
    }

    @Before
    public void setup() {
        this.primeFactorization = new PrimeFactorization();
    }
}