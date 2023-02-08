package com.bathanh.exercise.basic.number;

public class Exercise05 {

    public int sumOfNumbers(final int n) {
        int total = 0;
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i <= n; i++) {
            total += i * (i + 1);
        }

        return total;
    }
}
