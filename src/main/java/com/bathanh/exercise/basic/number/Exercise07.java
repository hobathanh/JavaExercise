package com.bathanh.exercise.basic.number;

public class Exercise07 {

    public String calculateEqual() {
        final StringBuilder resultString = new StringBuilder();
        for (int i = 10; i <= 99999; i++){
            if(i == sumNumber(i)) {
                resultString.append(i + " , ");
            }
        }
        return resultString.substring(0, resultString.length() - 2).trim();
    }

    public int sumNumber(final int n) {
        int inputN = n;
        int sumNumber = 0;
        while (inputN != 0) {
            int digitNumber = inputN % 10;
            sumNumber += Math.pow(digitNumber,numberOfDigits(n));
            inputN /= 10;
        }
        return sumNumber;
    }

    public int numberOfDigits(int n) {
        int m = 0;
        while (n > 0 ) {
            n /= 10;
            m++;
        }
        return m;
    }

}
