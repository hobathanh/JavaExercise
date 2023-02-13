package com.bathanh.exercise.basic.string;

public class Ex303 {

    public int sumAllNumberString(final String s) {
        int sum = 0;
        int number = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                number = s.charAt(i) - '0';
                for (j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) < '0' || s.charAt(j) > '9') {
                        break;
                    }
                    number = number * 10 + s.charAt(j) - '0';
                }
                sum += number;
                i = j;
            }
        }
        return sum;
    }
}
