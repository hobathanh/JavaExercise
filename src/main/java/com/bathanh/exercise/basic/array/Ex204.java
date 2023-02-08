package com.bathanh.exercise.basic.array;

import java.util.Arrays;

public class Ex204 {

    public int[] findMaxLengthArray(final int[] array) {
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

        return Arrays.copyOfRange(array, start, end);
    }
}
