package com.timothypaetz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by paetztm on 3/8/2017.
 */
public class PrimeFactorization {
    public List<Integer> getPrimeFactors(int i) {
        List<Integer> factors = new ArrayList<>();

        while (i % 2 == 0) {
            factors.add(2);
            i /= 2;
        }
        int endAt = (int)Math.sqrt(i);
        int factor = 3;

        while (factor <= endAt)
        {
            while (i % factor == 0)
            {
                factors.add(factor);
                i /= factor;
                endAt = (int)Math.sqrt(factor);
            }
            factor += 2;

        }
        if (i > 1)
            factors.add(i);
        return factors;
    }
}
