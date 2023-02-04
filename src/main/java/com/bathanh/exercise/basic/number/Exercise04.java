package com.bathanh.exercise.basic.number;

public class Exercise04 {

    public static int calculateFibonacci(final int n) {
        if (n < 0) {
            throw new NegativeArraySizeException("Negative input value");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        int[] arrayFibo = new int[n + 1];
        arrayFibo[0] = 0;
        arrayFibo[1] = 1;
        int totalFibo = arrayFibo[0] + arrayFibo[1];
        for (int i = 2; i <= n; i++) {
            arrayFibo[i] = arrayFibo[i - 1] + arrayFibo[i - 2];
            totalFibo += arrayFibo[i];
        }
        return totalFibo;
    }
}
