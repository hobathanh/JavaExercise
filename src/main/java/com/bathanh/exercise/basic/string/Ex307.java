package com.bathanh.exercise.basic.string;

public class Ex307 {

    public int findIndexStringInString(final String s1, final String s2) {
        if (IndexString(s1, s2) == -1) {
            throw new IllegalArgumentException();
        }
        return IndexString(s1, s2);
    }

    public int IndexString(final String s1, final String s2) {
        if (s2.length() - s1.length() < 0) {
            return -1;
        }
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int j;
            for (j = 0; j < s1.length(); j++) {
                if (s2.charAt(i + j) != s1.charAt(j)) {
                    break;
                }
            }
            if (j == s1.length()) {
                return i;
            }
        }
        return -1;
    }
}
