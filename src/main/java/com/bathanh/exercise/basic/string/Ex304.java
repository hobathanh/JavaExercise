package com.bathanh.exercise.basic.string;

public class Ex304 {

    public boolean checkRepeatString(final String str) {
        String childString = "";
        for (int i = 0; i < str.length() / 2; i++) {
            childString += str.charAt(i);
            if (str.length() % childString.length() == 0 && isRepeating(str, childString)) {
                return true;
            }
        }
        return false;
    }

    public boolean isRepeating(String str, String child) {
        String leftOverString = str;
        int currIndex = leftOverString.indexOf(child);
        while (currIndex == 0) {
            if (currIndex + child.length() == leftOverString.length()) {
                return true;
            }
            leftOverString = leftOverString.substring(currIndex + child.length());
            currIndex = leftOverString.indexOf(child);
        }
        return false;
    }
}
