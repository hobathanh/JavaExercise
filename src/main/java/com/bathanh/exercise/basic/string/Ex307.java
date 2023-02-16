package com.bathanh.exercise.basic.string;

public class Ex307 {

    public int findIndexStringInString(final String inputString, final String subString) {
        for (int i = 0; i <= inputString.length() - subString.length(); i++) {
            if (isSubString(inputString, subString, i)) {
                return i;
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
