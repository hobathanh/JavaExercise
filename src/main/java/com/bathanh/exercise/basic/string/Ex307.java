package com.bathanh.exercise.basic.string;

public class Ex307 {

    public int findIndexStringInString(final String s1, final String s2) {

        for (int i = 0; i <= Math.abs(s1.length() - s2.length()); i++) {
            if (s1.length() - s2.length() >= 0) {
                if (isSubString(s1, s2, i)) {
                    return i;
                }
            } else {
                if (isSubString(s2, s1, i)) {
                    return i;
                }
            }

        }
        return -1;
    }

    public boolean isSubString(final String inputString, final String subString, final int index) {
        for (int i = 0; i < subString.length(); i++) {
            if (inputString.charAt(index + i) != subString.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
