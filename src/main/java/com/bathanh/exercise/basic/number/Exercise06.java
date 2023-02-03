package com.bathanh.exercise.basic.number;

public class Exercise06 {
    public double calculateSqrt (final double a) {
        double inputA = a;
        double result = 1.0d;
        double epsilon = 0.0001d;
        if (inputA < 0) {
            throw new IllegalArgumentException();
        } else if (inputA == 0) {
            return 0;
        }
        while (Math.abs(result * result - inputA) / inputA  >= epsilon)
            result = (inputA / result  - result) / 2 + result;
        return (double) Math.round(result * 10000d)/10000d ;
    }
}
