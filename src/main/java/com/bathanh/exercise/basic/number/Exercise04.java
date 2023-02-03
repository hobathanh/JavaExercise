package com.bathanh.exercise.basic.number;

import java.util.ArrayList;
import java.util.List;

public class Exercise04 {

    public static int calculateFibonacci(final int n) {
        int inputN = n ;
        if(inputN < 0) {
            throw new NegativeArraySizeException("Negative input value");
        }
        else if (inputN == 0 || inputN == 1) {
            return inputN;
        }
        else {
            int[] arrayFibo = new int[inputN+1];
            arrayFibo[0] = 0;
            arrayFibo[1] = 1;
            int totalFibo = arrayFibo[0] + arrayFibo[1];
            for (int i = 2; i <= n; i++) {
                arrayFibo[i] = arrayFibo[i-1] + arrayFibo[i-2];
                totalFibo += arrayFibo[i];
            }
            return totalFibo;
        }
    }
}
