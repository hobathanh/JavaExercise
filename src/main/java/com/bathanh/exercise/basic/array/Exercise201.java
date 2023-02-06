package com.bathanh.exercise.basic.array;

public class Exercise201 {

    public int searchArrayLargest(final int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
