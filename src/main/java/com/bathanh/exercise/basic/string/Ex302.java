package com.bathanh.exercise.basic.string;

public class Ex302 {

    public boolean checkSymmetricString(final String s) {
        String inputString = s;

        if (inputString.length() == 0 || inputString.length() == 1) {
            return true;
        }

        if (inputString.charAt(0) == inputString.charAt(inputString.length() - 1)) {
            return checkSymmetricString(inputString.substring(1, inputString.length() - 1));
        }

        return false;
    }
}

