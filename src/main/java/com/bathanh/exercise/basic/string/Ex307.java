package com.bathanh.exercise.basic.string;

public class Ex307 {

    public boolean searchStringInString(final String s1, final String s2) {
        return isInString(s1, s2);
    }

    public boolean isInString(final String s1, final String s2) {
        if (s1.length() < 0 || s2.length() < 0) {
            return false;
        }
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int j;
            for (j = 0; j < s1.length(); j++) {
                if (s2.charAt(i + j) != s1.charAt(j)) {
                    break;
                }
            }
            if (j == s1.length()) {
                return true;
            }
        }
        return false;
    }
}
