package com.bathanh.exercise.basic.number;

import java.util.List;

public class Exercise03 {

    public String analysisOutPrimeNumbers(final int a) {
        int n = a;
        final StringBuilder resultString = new StringBuilder();
        if(n == 0 || n == 1) {
            return "0";
        }
        else if (n < 0) {
            return "n la so nguyen duong";
        }
        for(int i = 2; i <= n; i++) {
            while (isPrimeNumber(i) && n % i == 0) {
                n = n / i;
                resultString.append(i + " * ");
                }
            }
        return resultString.substring(0, resultString.length() - 2).trim();
    }

    public boolean isPrimeNumber(final int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
