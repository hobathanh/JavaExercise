package com.bathanh.exercise.basic.string;

public class Ex304 {

    public boolean checkRepeatString(final String str) {
        String childString = "";
        for (int i = 0; i < str.length() / 2; i++) {
            childString += str.charAt(i);
            if (isRepeating(str, childString)) {
                return true;
            }
        }
        return false;
    }

    public boolean isRepeating(final String s1, final String s2) {
        if (s1.length() < s2.length() || s2.length() < 0) {
            return false;
        }
        if (s1.length() % s2.length() != 0) {
            return false;
        }
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s1.length() / s2.length(); j++) {
                if (s2.charAt(i) != s1.charAt(j * s2.length() + i)) {
                    return false;
                }
            }
        }
        return true;
    }
}