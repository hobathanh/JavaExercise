package com.bathanh.exercise.basic.array;

public class Ex205 {

    public int findDifferenceMaxAndMin(final int[] array) {
        int maxArray = array[0];
        int minArray = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minArray > array[i]) {
                minArray = array[i];
            }
            if (maxArray < array[i]) {
                maxArray = array[i];
            }
        }
        return maxArray - minArray;
    }
}
