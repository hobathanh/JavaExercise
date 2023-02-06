package com.bathanh.exercise.basic.number;

public class Exercise09 {

    public double calculateSqrt(final double n) {
        double start = 0;
        double end = n;
        final double epsilon = 0.00001;
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        while (end - start >= epsilon) {
            final double middle = (start + end) / 2;

            if (middle * middle < n) {
                start = middle;
            } else {
                end = middle;
            }
        }
        return start;
    }
}
