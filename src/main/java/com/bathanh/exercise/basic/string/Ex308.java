package com.bathanh.exercise.basic.string;

public class Ex308 {

    public boolean checkString(final String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                count -= 1;
            }
            if (s.charAt(i) == '(') {
                count += 1;
            }
            if (count < 0) {
                return false;
            }
        }
        return (count == 0);
    }
}
