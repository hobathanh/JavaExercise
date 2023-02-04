package com.bathanh.exercise.basic.number;

public class Exercise05 {

    public int sumOfNumbers(final int n) {
        int inputN = n;
        int total = 0;
        int i = 1;
        if (inputN < 0) {
            throw new IllegalArgumentException();
        }
        if (inputN == 0) {
            return inputN;
        }
        while (i <= inputN) {
            total += i * (i + 1);
            i++;
        }
        return total;
    }
}
