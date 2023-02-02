package com.bathanh.exercise.basic.number;

public class Exercise01 {
    public int USCLN(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public int BSCNN(final int a, final int b) {
        int result = USCLN(a,b);
        return (a*b)/result;
    }
}
