package com.bathanh.exercise.basic.string;

public class Ex301 {

    public String reverseString(final String s) {
        StringBuffer newString = new StringBuffer();

        for (int i = s.length() - 1; i >= 0; i--) {
            newString.append(s.charAt(i));
        }
        
        return newString.toString();
    }
}
