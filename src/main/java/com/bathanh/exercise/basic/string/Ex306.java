package com.bathanh.exercise.basic.string;

public class Ex306 {

    public int calculateBarcode(final String n) {
        int sum = 0;

        if (n.length() != 12) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < n.length(); i++) {
            if (i % 2 == 0) {
                sum += Integer.parseInt(n.charAt(i) + "");
            } else {
                sum += 3 * Integer.parseInt(n.charAt(i) + "");
            }
        }

        return 10 - (sum % 10);
    }
}
