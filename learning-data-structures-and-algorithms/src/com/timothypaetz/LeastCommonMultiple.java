package com.timothypaetz;

/**
 * Created by paetztm on 3/8/2017.
 */
public class LeastCommonMultiple {
    private final EuclidsAlgorithm euclidsAlgorithm;

    public LeastCommonMultiple(EuclidsAlgorithm euclidsAlgorithm) {
        this.euclidsAlgorithm = euclidsAlgorithm;
    }

    public int getLeastCommonMultiple(int a, int b) {
        return (a * b)/euclidsAlgorithm.getGreatestCommonDenominator(a, b);
    }
}
