package com.bathanh.exercise.basic.string;

public class Ex302 {

    public boolean checkSymmetricString(final String s) {
        String inputString = s;

        if (inputString.length() == 0 || inputString.length() == 1) {
            return true;
        }

        for (int i = 0; i <= inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}

