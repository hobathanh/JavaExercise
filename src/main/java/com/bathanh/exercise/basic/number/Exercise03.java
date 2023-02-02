package com.bathanh.exercise.basic.number;

import java.util.List;

public class Exercise03 {

    public String analysisOutPrimeNumbers(final int a) {
        int n = a;
        final StringBuilder arr = new StringBuilder();
        if(n < 2) {
            return "Input khong hop le";
        }
        else {
            for(int i = 2; i < n; i++) {
                while (isPrimeNumber(i) && n % i == 0) {
                    n = n / i;
                    if(n == 1) {
                        arr.append(i);
                    }
                    else {
                        arr.append(i + " * ");
                    }
                }
                if (n == 1) {
                    break;
                }
            }
        }
        return arr.toString();
    }

    public static boolean isPrimeNumber(final int n) {
        int primeN = n;
        if (primeN < 2) {
            return false;
        }
        else {
            int squareRoot = (int) Math.sqrt(primeN);
            for (int i = 2; i <= squareRoot; i++) {
                if (primeN % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
