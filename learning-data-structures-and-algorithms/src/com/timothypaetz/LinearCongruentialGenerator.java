package com.timothypaetz;

/**
 * Created by paetztm on 3/6/2017.
 */
public class LinearCongruentialGenerator {

    private final int a;
    private final int b;
    private final int m;

    public LinearCongruentialGenerator(int a, int b, int m) {
        this.a = a;
        this.b = b;
        this.m = m;
    }

    // formula: X sub(n+1) = (X sub(n) * A + B)(mod M)
    public int calculate(int n) {
        if (n == 0) return 0;
        else return (calculate(n-1) * a + b) % m;

    }
}
