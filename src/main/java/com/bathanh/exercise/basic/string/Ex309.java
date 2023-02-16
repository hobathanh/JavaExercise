package com.bathanh.exercise.basic.string;

public class Ex309 {

    public String formatString(final String s) {
        final StringBuffer result = new StringBuffer();
        char ch = ' ';

        for (int i = 0; i < s.length(); i++) {
            if (ch == ' ' && s.charAt(i) != ' ') {
                result.append(Character.toUpperCase(s.charAt(i)));
            } else {
                result.append(Character.toLowerCase(s.charAt(i)));
            }
            ch = s.charAt(i);
        }

        return result.toString().trim();
    }
}
