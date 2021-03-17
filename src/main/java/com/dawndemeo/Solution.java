package com.dawndemeo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        // create new array same size as original
        int[] rotatedA = new int[a.length];

        // append 2nd part of array to new array, then 1st part
        int index = 0;  // index for rotatedA

        for (int i = d; i < a.length; i++) {
            rotatedA[index] = a[i];
            index++;
        }

        for (int i = 0; i < d; i++) {
            rotatedA[index] = a[i];
            index++;
        }

        return rotatedA;
    }


    public static void main(String[] args) {

    }

}
