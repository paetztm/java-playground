package com.timothypaetz;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by paetztm on 3/6/2017.
 */
public class RandomizePartly {
    private final List<Integer> numbers;

    public RandomizePartly(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getSelectees(int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int j = random.nextInt(numbers.size());
            Integer temp = numbers.get(i);
            numbers.set(i, numbers.get(j));
            numbers.set(j, temp);
        }
        return numbers.subList(0, n);
    }
}
