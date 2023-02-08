package com.bathanh.exercise.basic.number;

public class Exercise05 {

    public int sumOfNumbers(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i * (i + 1);
        }

        return total;
    }
}
