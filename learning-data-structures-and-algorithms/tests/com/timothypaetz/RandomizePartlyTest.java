package com.timothypaetz;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paetztm on 3/6/2017.
 */
public class RandomizePartlyTest {

    private static final int TOTAL_NUMBER = 10_000;
    private List<Integer> numbers         = new ArrayList<>();

    @Test
    public void testRequestedNumberOfSelecteesIsCorrect() {
        RandomizePartly randomizePartly = new RandomizePartly(numbers);
        List<Integer> randomSelectees = randomizePartly.getSelectees(5);
        assertEquals(5, randomSelectees.size());
    }

    @Before
    public void createListOfNumbers() {
        for (int i = 0; i < TOTAL_NUMBER; i++) {
            numbers.add(i);
        }
    }
}