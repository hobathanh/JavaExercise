package com.bathanh.exercise.basic.number;

public class Exercise03 {

    public String analysisOutPrimeNumbers(final int a) {
        int n = a;
        final StringBuilder resultString = new StringBuilder();
        if (n == 0 || n == 1) {
            return "0";
        }
        if (n < 0) {
            return "- " + analysisOutPrimeNumbers(-n);
        }
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                resultString.append(i + " * ");
            }
        }

        return resultString.substring(0, resultString.length() - 3);
    }
}
