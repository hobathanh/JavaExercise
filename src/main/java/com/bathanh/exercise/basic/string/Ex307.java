package com.bathanh.exercise.basic.string;

public class Ex307 {

    public boolean searchStringInString(final String s1, final String s2) {

        int lengthS1 = s1.length();
        int lengthS2 = s2.length();

        for (int i = 0; i <= lengthS2 - lengthS1; i++) {
            int j;
            for (j = 0; j < lengthS1; j++) {
                if (s2.charAt(i + j) != s1.charAt(j)) {
                    break;
                }
            }
            if (j == lengthS1) {
                return true;
            }
        }
        return false;
    }
}
