package com.bathanh.exercise.basic.string;

public class Ex303 {

    public int sumAllNumberString(final String s) {
        int sum = 0;
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                resultString.append(s.charAt(i));
            } else {
                if (resultString.length() > 0) {
                    sum += Integer.parseInt(resultString.toString());
                }
                resultString.setLength(0);
            }
        }
        if (resultString.length() > 0) {
            sum += Integer.parseInt(resultString.toString());
        }

        return sum;
    }
}
