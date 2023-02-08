package com.bathanh.exercise.basic.string;

public class Ex301 {

    public String reverseString(final String s) {
        String newString = "";
        char characters;
        for (int i = s.length() - 1; i >= 0; i--) {
            characters = s.charAt(i);
            newString += characters;
        }
        return newString.toString();
    }
}
