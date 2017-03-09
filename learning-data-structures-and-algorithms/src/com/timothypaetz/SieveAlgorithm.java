package com.timothypaetz;


/**
 * Created by paetztm on 3/8/2017.
 */
public class SieveAlgorithm {
    public int countPrimesUpTo(int number) {
        boolean[] primes = new boolean[number + 1];
        primes[2] = true;
        for (int i = 3; i <= number; i+=2)
        {
            primes[i] = true;
        }
        for (int factor = 3; factor * factor <= number; factor+=2) {
            if (primes[factor]) {
                for (int j = factor; factor * j <= number; j++) {
                    primes[factor * j] = false;
                }
            }
        }
        int totalPrimes = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) totalPrimes++;
        }
        return totalPrimes;
    }
}
