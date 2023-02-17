package com.bathanh.exercise.basic.string;

public class Ex307 {

    public int findIndexOfString(final String string, final String pattrenString) {
        for (int index = 0; index <= string.length() - pattrenString.length(); index++) {
            if (indexOfString(string, pattrenString, index)) {
                return index;
            }
        }
        return -1;
    }

    public boolean indexOfString(String string, String pattrenString, int index) {
        for (int i = 0; i < pattrenString.length(); i++) {
            if (string.charAt(index + i) != pattrenString.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
