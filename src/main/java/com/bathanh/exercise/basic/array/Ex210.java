package com.bathanh.exercise.basic.array;

public class Ex210 {

    public int[] reverseArray(final int[] array) {
        int[] result = new int[array.length];
        int j = array.length - 1;
        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[j--];
        }
        return result;
    }
}
