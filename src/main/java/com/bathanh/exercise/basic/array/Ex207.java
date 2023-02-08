package com.bathanh.exercise.basic.array;

public class Ex207 {

    public int[] sortArrayAsc(final int[] array, final int a) {
        int[] newArray = new int[array.length + 1];
        int index = indexArray(array, a);
        int j = 0;
        for (int i = 0; i <= newArray.length - 1; i++) {
            if (i == index) {
                newArray[index] = a;
            } else {
                newArray[i] = array[j++];
            }
        }
        return newArray;
    }

    public int indexArray(final int[] array, final int a) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int m = low + (high - low) / 2;

            if (array[m] == a) {
                return m;
            }
            if (array[m] < a)
                low = m + 1;
            else
                high = m - 1;
        }
        return low;
    }
}
