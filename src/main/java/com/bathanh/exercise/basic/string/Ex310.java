package com.bathanh.exercise.basic.string;

public class Ex310 {

    public String deleteSpaceString(final String s) {
        StringBuffer result = new StringBuffer();
        char ch = ' ';

        for (int i = 0; i < s.length() - 1; i++) {
            ch = s.charAt(i);
            if (ch == ' ' && s.charAt(i + 1) == ' ') {
                continue;
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString().trim();
    }
}
