package com.timothypaetz;

/**
 * Created by paetztm on 3/6/2017.
 */
public class EuclidsAlgorithm {
    public int getGreatestCommonDenominator(int a, int b) {
        int remainder;
        while (b != 0) {
            remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
