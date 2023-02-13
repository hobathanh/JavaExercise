package com.bathanh.exercise.basic.string;

public class Ex303 {

    public int sumAllNumberString(final String s) {
        int sum = 0;
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                number = number * 10 + s.charAt(i) - '0';
            } else {
                sum += number;
                number = 0;
            }
        }

        return sum + number;
    }
}
