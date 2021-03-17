package com.dawndemeo;

import org.junit.Test;

import static com.dawndemeo.Solution.rotLeft;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void example() {
        int[] arr = {1, 2, 3, 4, 5};
        int rotations = 2;

        int[] expectedResult = {3, 4, 5, 1, 2};

        assertArrayEquals(expectedResult, rotLeft(arr, rotations));
    }

    @Test
    public void sample() {
        int[] arr = {1, 2, 3, 4, 5};
        int rotations = 4;

        int[] expectedResult = {5, 1, 2, 3, 4};

        assertArrayEquals(expectedResult, rotLeft(arr, rotations));
    }


}