package com.bathanh.exercise.basic.array;

public class Ex207 {

    public int[] insertToSortedArray(final int[] array, final int a) {
        int[] newArray = new int[array.length + 1];
        int index = indexArray(array, a);

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = a;
        for (int j = index + 1; j <= newArray.length - 1; j++) {
            newArray[j] = array[j - 1];
        }
        return newArray;
    }

    public int indexArray(final int[] array, final int a) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            final int middle = low + (high - low) / 2;

            if (array[middle] == a) {
                return middle;
            }
            if (array[middle] < a) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return low;
    }
}
