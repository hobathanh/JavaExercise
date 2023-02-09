package com.bathanh.exercise.basic.string;

public class Ex305 {

    public boolean checkBarcode(final String n) {
        int sumOld = 0;
        int sumEven = 0;
        if (n.length() != 13) {
            return false;
        }
        for (int i = 0; i < n.length(); i++) {
            if (i % 2 == 0) {
                sumOld += Integer.parseInt(n.charAt(i) + "");
            } else {
                sumEven += Integer.parseInt(n.charAt(i) + "");
            }
        }
        return ((sumOld + 3 * sumEven) % 10 == 0);
    }
}
