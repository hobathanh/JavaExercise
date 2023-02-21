package com.bathanh.exercise.basic.string;

public class Ex307 {

    public int findIndexOfString(final String inputString, final String subString) {
        for (int index = 0; index <= inputString.length() - subString.length(); index++) {
            if (isSubStringAt(inputString, subString, index)) {
                return index;
            }
        }
        return -1;
    }

    public boolean isSubStringAt(String inputString, String subString, int index) {
        for (int i = 0; i < subString.length(); i++) {
            if (inputString.charAt(index + i) != subString.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
