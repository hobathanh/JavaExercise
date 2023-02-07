package com.bathanh.exercise.basic.array;

public class Ex204 {

    public String findMaxLengthArray(final int[] array) {
        StringBuilder resultString = new StringBuilder();
        int length = 1;
        int max = 1;
        int start = 0;
        int end = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                length++;
                if (length > max) {
                    max = length;
                    start = i + 2 - length;
                    end = i + 2;
                }
            } else {
                length = 1;
            }
        }
        for (int i = start; i < end; i++) {
            resultString.append(array[i] + ", ");
        }
        return resultString.substring(0, resultString.length() - 2);
    }
}
