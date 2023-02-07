package com.bathanh.exercise.basic.array;

public class Ex205 {

    public int findDifferenceMaxAndMin(final int[] array) {
        int maxArray = array[0];
        int minArray = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < minArray) {
                minArray = array[i];
            } else if (array[i] > maxArray) {
                maxArray = array[i];
            }
        }
        return maxArray - minArray;
    }
}
