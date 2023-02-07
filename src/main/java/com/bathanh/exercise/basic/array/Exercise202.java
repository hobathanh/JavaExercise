package com.bathanh.exercise.basic.array;

public class Exercise202 {

    public int calucuteSignOfTotal(final int[] array) {
        int totalEvenArray = 0;
        int totalOddArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                totalEvenArray += array[i];
            } else {
                totalOddArray += array[i];
            }
        }
        return totalEvenArray - totalOddArray;
    }
}
