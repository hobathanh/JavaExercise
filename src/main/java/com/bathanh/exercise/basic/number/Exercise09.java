package com.bathanh.exercise.basic.number;

public class Exercise09 {


    public double calculateSqrt(final double n) {
        double start = 0;
        double end = n;
        double epsilon = 0.00001;
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0 || n == 1) {
            return n;
        }
        while (end - start >= epsilon) {
            double midN = (start + end) / 2;
            double sqrtN = midN * midN;

            if (sqrtN < n) {
                start = midN;
            } else {
                end = midN;
            }
        }
        return start;
    }
}
