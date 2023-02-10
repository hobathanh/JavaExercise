package com.bathanh.exercise.basic.string;

public class Ex306 {

    public int calculateBarcode(final String n) {
        if (n.length() != 12) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            if (i % 2 == 0) {
                sum += n.charAt(i) - '0';
            } else {
                sum += 3 * (n.charAt(i) - '0');
            }
        }

        return (10 - (sum % 10)) % 10;
    }
}
