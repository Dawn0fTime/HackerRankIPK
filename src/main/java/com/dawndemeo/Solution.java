package com.dawndemeo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        // Given: 6x6 array, 16 hourglasses
        // i.e. 4x4 positions of top left corner of hourglasses
        final int ARR_SIZE = 6;
        int maxHourglassSum = Integer.MIN_VALUE;

        // for each hourglass, sum all numbers in relation to top left corner
        for (int i = 0; i < ARR_SIZE - 2; i++) {
            for (int j = 0; j < ARR_SIZE - 2; j++) {
                int hourglassSum = arr[i][j] + arr[i][j+1] + arr[i][j+2]    // Top of hourglass
                        + arr[i+1][j+1]                                     // Middle of hourglass
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];      // Bottom of hourglass

                if (hourglassSum > maxHourglassSum) {
                    maxHourglassSum = hourglassSum;
                }
            }
        }

        return maxHourglassSum;
    }


    public static void main(String[] args) {

    }

}
