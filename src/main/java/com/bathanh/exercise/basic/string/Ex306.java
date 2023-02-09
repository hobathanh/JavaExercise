package com.bathanh.exercise.basic.string;

public class Ex306 {

    public int calculateBarcode(final String n) {
        if (n.length() != 12) {
            throw new IllegalArgumentException();
        }
        int verify = 0;
        int sumOld = 0;
        int sumEven = 0;
        for (int i = 0; i < n.length(); i++) {
            if (i % 2 == 0) {
                sumOld += Integer.parseInt(n.charAt(i) + "");
            } else {
                sumEven += Integer.parseInt(n.charAt(i) + "");
            }
        }
        for (int i = 0; i < 10; i++) {
            if ((sumOld + i + 3 * sumEven) % 10 == 0) {
                verify = i;
            }
        }
        return verify;
    }
}
