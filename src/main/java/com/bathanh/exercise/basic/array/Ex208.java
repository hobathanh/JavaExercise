package com.bathanh.exercise.basic.array;

public class Ex208 {

    public int sumOfSquares(final int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += (array[i] * array[i]);
        }
        return sum;
    }
}
