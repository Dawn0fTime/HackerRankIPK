package com.dawndemeo;

import org.junit.Test;

import static com.dawndemeo.Solution.hourglassSum;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void example() {
        int[][] arr = {{-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}};

        int expectedResult = 28;

        assertEquals(expectedResult, hourglassSum(arr));
    }

    @Test
    public void sample() {
        int[][] arr = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};

        int expectedResult = 19;

        assertEquals(expectedResult, hourglassSum(arr));
    }


}