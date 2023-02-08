package com.bathanh.exercise.basic.string;

public class Ex302 {

    public boolean checkSymmetricString(String s) {
        int midIndex;
        int length = s.length();

        if (length == 0) {
            return false;
        }
        if (length % 2 == 0) {
            midIndex = length / 2;
        } else {
            midIndex = length / 2 + 1;
        }

        int indexString1 = 0;
        int indexString2 = length - 1;
        while (indexString1 < midIndex && indexString2 >= midIndex) {
            if (s.charAt(indexString1) == s.charAt(indexString2)) {
                indexString1 += 1;
                indexString2 -= 1;
            } else {
                return false;
            }
        }
        return true;
    }
}

