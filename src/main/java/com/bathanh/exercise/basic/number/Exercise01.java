package com.bathanh.exercise.basic.number;

public class Exercise01 {

    public int calculateGCD(final int a, final int b) {
        int tempA = a;
        int tempB = b;
        while (tempA != tempB) {
            if (tempA > tempB) {
                tempA = tempA - tempB;
            }
            else {
                tempB = tempB - tempA;
            }
        }
        return tempA;
    }

    public int calculateLCM(final int a, final int b) {
        final int result = calculateGCD(a,b);
        return (a * b) / result;
    }
}
