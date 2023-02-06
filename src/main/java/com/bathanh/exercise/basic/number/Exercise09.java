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
            final double averageN = (start + end) / 2;
            double sqrtN = averageN * averageN;

            if (sqrtN < n) {
                start = averageN;
            } else {
                end = averageN;
            }
        }
        return start;
    }
}
