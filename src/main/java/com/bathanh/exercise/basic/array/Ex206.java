package com.bathanh.exercise.basic.array;

public class Ex206 {
    public int findIndexNumberBinarySearch(final int[] array, final int a) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            final int middle = left + (right - left) / 2;
            if (array[middle] == a) {
                return middle;
            }
            if (array[middle] < a) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
