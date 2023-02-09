package com.bathanh.exercise.basic.string;

public class Ex310 {

    public String deleteSpaceString(final String s) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                continue;
            }
            result.append(s.charAt(i));

        }
        return result.toString().trim();
    }
}
