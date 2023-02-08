package com.bathanh.exercise.basic.array;

public class Exercise203 {

    public int[] sortSumOfDigitAsc(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (sumOfDigits(array[i]) > sumOfDigits(array[j])) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public int sumOfDigits(final int n) {
        int inputN = n;
        int sum = 0;
        while (inputN > 0) {
            sum += inputN % 10;
            inputN = inputN / 10;
        }
        return sum;
    }
}
