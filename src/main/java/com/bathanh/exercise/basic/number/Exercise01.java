package com.bathanh.exercise.basic.number;

public class Exercise01 {

    public int calculateGCD(final int a,final int b) {
        int A = a;
        int B = b;
        while (A != B) {
            if (A > B){
                A = A - B;
            }
            else{
                B = B - A;
            }
        }
        return A;
    }

    public int calculateLCM(final int a, final int b) {
        final int result = calculateGCD(a,b);
        return (a * b) / result;
    }
}
