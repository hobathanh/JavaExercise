package com.bathanh.exercise.basic.string;

public class Ex302 {

    public boolean checkSymmetricString(final String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}

