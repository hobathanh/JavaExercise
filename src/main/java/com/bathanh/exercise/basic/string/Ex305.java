package com.bathanh.exercise.basic.string;

public class Ex305 {

    public boolean checkBarcode(final String n) {
        if (n.length() != 13) {
            return false;
        }

        int sumOld = 0;
        int sumEven = 0;
        for (int i = 0; i < n.length(); i++) {
            if (i % 2 == 0) {
                sumOld += n.charAt(i) - '0';
            } else {
                sumEven += n.charAt(i) - '0';
            }
        }

        return (sumOld + 3 * sumEven) % 10 == 0;
    }
}
